package dio.desafio.bootcamp.model;

public class Dev {

    private String nome;

    private Mentoria mentorias;

    private Curso atividadesOuCursos;

    public void inscreverNoBootcamp(){}

    public void progredir(){}

    public void calcularTotalXp(){}

    public void exibirCursos(){}


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
}
