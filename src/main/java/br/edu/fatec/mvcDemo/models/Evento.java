package br.edu.fatec.mvcDemo.models.eventos;

public class Evento {
    private String nome;
    private String local;
    private String data;

    public Evento(String nome, String local, String data) {
        this.nome = nome;
        this.local = local;
        this.data = data;
    }

    // Getters e setters (se necessário)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
