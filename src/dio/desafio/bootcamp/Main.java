package dio.desafio.bootcamp;

import dio.desafio.bootcamp.model.Bootcamp;
import dio.desafio.bootcamp.model.Curso;
import dio.desafio.bootcamp.model.Dev;
import dio.desafio.bootcamp.model.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("POO(Programação Orientada a Objetos) - Linguagem Java");
        curso.setDescricao("Você irá aprender a desenvolver pequenas aplicações na linguagem Java.");
        curso.setCargaHoraria(2);

        System.out.println(curso.getTitulo());
        System.out.println(curso.getDescricao());
        System.out.println(curso.getCargaHoraria() == 1 ? curso.getCargaHoraria() + " hora" : curso.getCargaHoraria() + " horas");

        Curso curso1 = new Curso();
        curso1.setTitulo("Spring Boot");
        curso1.setDescricao("Introdução para utilizar o framework spring com a linguagem java!!!!");
        curso1.setCargaHoraria(1);

        System.out.println(curso1.getTitulo());
        System.out.println(curso1.getDescricao());
        System.out.println(curso1.getCargaHoraria() == 1 ? curso1.getCargaHoraria() + " hora" : curso1.getCargaHoraria() + " horas");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Como utilizar a plataforma DIO");
        mentoria.setDescricao("Nessa mentoria será ensinado como se faz para utilizar o site da plataforma da DIO.");
        mentoria.setDataMentoria(LocalDate.now());

        System.out.println(mentoria.getTitulo());
        System.out.println(mentoria.getDescricao());
        System.out.println(mentoria.getDataMentoria());

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Aprendendo POO");
        mentoria1.setDescricao("Para que serve a POO e como ela foi implementada e quais facilidades ela nos trouxe.");
        mentoria1.setDataMentoria(LocalDate.now());

        System.out.println(mentoria1.getTitulo());
        System.out.println(mentoria1.getDescricao());
        System.out.println(mentoria1.getDataMentoria());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Philips Fullstack Developer");
        bootcamp.setDescricao("Torne-se um desenvolvedor tanto back como front em java e angular utilizando as melhores ferramentas!!!");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(mentoria1);

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        Dev devVictor = new Dev();
        devVictor.setNome("Victor");
        devVictor.inscreverNoBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devVictor.getConteudosInscritos());
        devVictor.progredir();
        System.out.println("*-----*");
        System.out.println("Conteudos inscritos: " + devVictor.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devVictor.getConteudosConcluidos());
        devVictor.progredir();
        System.out.println("XP: " + devVictor.calcularTotalXp());

        System.out.println("--------------------------------*-------------------------------------");

        Dev devAntonio = new Dev();
        devAntonio.setNome("Antonio");
        devAntonio.inscreverNoBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devAntonio.getConteudosInscritos());
        devAntonio.progredir();
        System.out.println("*-----*");
        System.out.println("Conteudos inscritos: " + devAntonio.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devAntonio.getConteudosConcluidos());
        System.out.println("XP: " + devAntonio.calcularTotalXp());

    }
}
