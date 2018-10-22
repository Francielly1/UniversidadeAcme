package com.example.a17170086.universidadeacme.model;

public class Boletim {

    private int id;
    private String disciplina;
    private int nota;
    private int faltas;
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

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}
