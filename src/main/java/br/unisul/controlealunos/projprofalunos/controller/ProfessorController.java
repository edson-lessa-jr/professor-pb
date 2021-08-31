package br.unisul.controlealunos.projprofalunos.controller;


import br.unisul.controlealunos.projprofalunos.dto.ProfessorDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {


    @GetMapping("/{id}")
    public ProfessorDTO localizarProfessor(@PathVariable(name = "id") Long id){
        System.out.println(id);
        ProfessorDTO professorDTO = new ProfessorDTO();
        professorDTO.setNome("Edson Lessa");
        professorDTO.setDataNascimento(new Date());
        String[] especialidades = {"PHP","Java"};
        professorDTO.setEspecialidades(Arrays.asList(especialidades) );
        return professorDTO;
    }

    @GetMapping
    public List<ProfessorDTO> listarProfessors(){
        List<ProfessorDTO> professorDTOS = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("JS");
        professorDTOS.add(new ProfessorDTO("José", new Date(), strings));
        professorDTOS.add(new ProfessorDTO("Maria", new Date(), strings));
        return professorDTOS;
    }

    @PostMapping
    public void gravarProfessor(@RequestBody ProfessorDTO dto){
        System.out.println(dto);

    }
}
