package br.unisul.controlealunos.projprofalunos.dto;


import java.util.Date;
import java.util.List;

public class ProfessorDTO {
    private String nome;
    private String dataNascimento;
    private List<String> especialidades;

    public ProfessorDTO (){}

    public ProfessorDTO(String nome, String dataNascimento, List<String> especialidades) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.especialidades = especialidades;
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
}
