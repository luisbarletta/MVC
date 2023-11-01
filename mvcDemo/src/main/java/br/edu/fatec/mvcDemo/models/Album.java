package br.edu.fatec.mvcDemo.models;

public class Album {
    private String nome;
    private String artista;
    private double nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Album (String nome, String artista, double nota){
        this.nome = nome;
        this.artista = artista;
        this.nota = nota;
    }
}
