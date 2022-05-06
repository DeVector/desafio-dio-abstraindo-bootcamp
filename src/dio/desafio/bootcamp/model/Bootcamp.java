package dio.desafio.bootcamp.model;

import java.time.LocalDate;

public class Bootcamp {

    private String nome;

    private String descricao;

    private LocalDate dataInicial;

    private LocalDate dataFinal;

    private Mentoria mentorias;

    private Curso atividadesOuCursos;

    private Dev devs;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Mentoria getMentorias() {
        return mentorias;
    }

    public void setMentorias(Mentoria mentorias) {
        this.mentorias = mentorias;
    }

    public Curso getAtividadesOuCursos() {
        return atividadesOuCursos;
    }

    public void setAtividadesOuCursos(Curso atividadesOuCursos) {
        this.atividadesOuCursos = atividadesOuCursos;
    }

    public Dev getDevs() {
        return devs;
    }

    public void setDevs(Dev devs) {
        this.devs = devs;
    }
}
