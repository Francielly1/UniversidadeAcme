package com.example.a17170086.universidadeacme.model;

public class Boletim {

    private int id;
    private String disciplina;
    private Integer nota;
    private Integer faltas;
    private String semestre;

    //construtor
    public Boletim(int id, String disciplina, int nota, int faltas, String semestre) {
        this.setId(id);
        this.disciplina = disciplina;
        this.nota = nota;
        this.faltas = faltas;
        this.semestre = semestre;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }



    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Integer getFaltas() {
        return faltas;
    }

    public void setFaltas(Integer faltas) {
        this.faltas = faltas;
    }
}
