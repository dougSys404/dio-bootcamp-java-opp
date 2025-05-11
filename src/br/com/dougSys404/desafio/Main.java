package br.com.dougSys404.desafio;

import br.com.dougSys404.desafio.domain.Bootcamp;
import br.com.dougSys404.desafio.domain.Curso;
import br.com.dougSys404.desafio.domain.Dev;
import br.com.dougSys404.desafio.domain.Mentoria;

import javax.swing.plaf.synth.SynthOptionPaneUI;
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


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcampo Java Dev");
        bootcamp.setDescricao("Descrição bootcamp java dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("John Green");
        System.out.println();
        System.out.println("Conteúdos inscritos para " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("A saída neste momento deve ser vazia!");


        Dev dev2 = new Dev();
        dev2.setNome("Mary Gray");
        System.out.println();
        System.out.println("Conteúdos inscritos para " + dev2.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("A saída neste momento deve ser vazia!");

        dev1.inscreverBootCamp(bootcamp);
        System.out.println();
        System.out.println("Após se inscrever no bootcamp:");
        System.out.println("Conteúdos inscritos para " + dev1.getNome() + ": " + dev1.getConteudosInscritos());

        dev2.inscreverBootCamp(bootcamp);
        System.out.println();
        System.out.println("Após se inscrever no bootcamp:");
        System.out.println("Conteúdos inscritos para " + dev2.getNome() + ": " + dev2.getConteudosInscritos());

        System.out.println();
        System.out.println("Conteúdos contluídos para " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());

        System.out.println();
        System.out.println("Conteúdos contluídos para " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());

        System.out.println();
        System.out.println("***************************CONCLUINDO CONTEÚDOS************************************");
        dev1.progredir();
        dev2.progredir();
        System.out.println();
        System.out.println("Conteúdos contluídos para " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());

        System.out.println();
        System.out.println("Conteúdos contluídos para " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());

        System.out.println();
        System.out.println("***************************CONSULTANDO CONTEÚDOS INSCRITOS NOVAMENTE************************************");
        System.out.println();
        System.out.println("Conteúdos inscritos para " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("XP: " + dev1.calcularTotalXp());
        System.out.println("O curso de java deve sumir");

        System.out.println();
        System.out.println("Conteúdos inscritos para " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("XP: " + dev2.calcularTotalXp());
        System.out.println("O curso de java deve sumir");


        System.out.println();
        System.out.println("***************************PROGREDINDO SOMENTE DEV1************************************");
        System.out.println();
        dev1.progredir();
        System.out.println("Conteúdos inscritos para " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos contluídos para " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());
        System.out.println("O curso de java e java script deve sumir");


        System.out.println();
        System.out.println("***************************CONCLUÍNDO BOOTCAMP SOMENTE DEV2************************************");
        System.out.println();

        dev1.progredir();
        dev1.progredir();
        System.out.println();
        System.out.println("Conteúdos inscritos para " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos contluídos para " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
        System.out.println("Todos os conteúdos inscritos devem sumir");
    }
}