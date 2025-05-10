package br.com.dougSys404.desafio;

import br.com.dougSys404.desafio.domain.Curso;
import br.com.dougSys404.desafio.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de java");
        curso1.setDescricao("Descrição do curso de java");
        curso1.setCargaHoraria(8);

        System.out.println();
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Java Script");
        curso2.setDescricao("Descrição do curso de Java Script");
        curso2.setCargaHoraria(8);

        System.out.println();
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println();
        System.out.println(mentoria);
    }
}