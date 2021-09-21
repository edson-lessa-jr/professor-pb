package br.unisul.controlealunos.projprofalunos.dto;


import br.unisul.controlealunos.projprofalunos.model.Especialidade;
import br.unisul.controlealunos.projprofalunos.model.Professor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProfessorDTO {
    private Long id;
    private String nome;
    private String dataNascimento;
    private List<String> especialidades;

    public ProfessorDTO (){}

    public ProfessorDTO(String nome, String dataNascimento, List<String> especialidades) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.especialidades = especialidades;
    }

    public ProfessorDTO(Professor professor) {
        this.id= professor.getId();
        this.nome=professor.getNome();
        this.dataNascimento= professor.getDataNascimentoFormada();
        this.especialidades=new ArrayList<>();
        for (int i=0; i<professor.getEspecialidades().size(); i++){
            Especialidade especialidade = professor.getEspecialidades().get(i);
            this.especialidades.add(especialidade.name());
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<String> especialidades) {
        this.especialidades = especialidades;
    }

    @Override
    public String toString() {
        return "ProfessorDTO {\n" +
                "Nome =" + nome + "\n" +
                ", Data Nascimento=" + dataNascimento +"\n"+
                ", Especialidades=" + especialidades +"\n"+
                '}';
    }

    public Professor converteParaProfessor(ProfessorDTO dto) {
        this.id=null;
        Professor professor = new Professor();
        professor.setNome(dto.nome);
        professor.setDataNascimento(dto.dataNascimento);
        for (int i=0; i<this.especialidades.size();i++){
            professor.adicionarEspecialidade(Especialidade.valueOf(this.especialidades.get(i)));
        }
        return professor;
    }
}
