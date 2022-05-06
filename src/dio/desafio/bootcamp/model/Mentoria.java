package dio.desafio.bootcamp.model;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate dataMentoria;

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{Titulo: " + getTitulo() +
                ", descricao: " + getDescricao() +
                ", dataMentoria=" + dataMentoria +
                '}';
    }
}
