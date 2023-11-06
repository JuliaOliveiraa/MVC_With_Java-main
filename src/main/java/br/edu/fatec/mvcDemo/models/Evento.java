package br.edu.fatec.mvcDemo.models;

public class Aluno {

    private String nome;
    private String disciplina;

    private double p1;

    private double p2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public Aluno(String nome, String disciplina, double p1, double p2) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.p1 = p1;
        this.p2 = p2;
    }
}
