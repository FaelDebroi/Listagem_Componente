package com.example.componentesdelistagem.model;

public class Filmes {
  private String filme, genero , ano, Classificacao ;

    public Filmes(String filme, String genero, String ano, String Classificacao) {
        this.filme = filme;
        this.genero = genero;
        this.ano = ano;
        this.Classificacao = Classificacao;
    }

    public String getClassificacao() {
        return Classificacao;
    }

    public void setClassificacao(String classificacao) {
        Classificacao = classificacao;
    }

    public String getFilme() { //pega
         return filme;
    }

    public void setFilme(String filme) { // seta
        this.filme = filme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
