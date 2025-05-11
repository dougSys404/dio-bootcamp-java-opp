package br.com.dougSys404.desafio.services;

import br.com.dougSys404.desafio.domain.Conteudo;
import br.com.dougSys404.desafio.domain.Dev;

import java.util.Scanner;

public class AuxiliaryCaller {

    Dev desenvolvedor = new Dev();
    Scanner sc = new Scanner(System.in);

    public void caller(){

        AuxiliaryFactory factory = new AuxiliaryFactory();
        factory.init();

        System.out.println("Bem vindo ao programa de BootCamp da DIO!");
        System.out.println("Digite seu nome para se inscrever no " + factory.bootcamp.getNome());
        System.out.print("Nome completo: ");
        String nome = sc.next();
        desenvolvedor.setNome(nome);

        desenvolvedor.inscreverBootCamp(factory.bootcamp);

        System.out.println("Parabens, você está inscrito no " + factory.bootcamp.toString());
        System.out.println();
        System.out.println();

        System.out.println("Seus cursos e mentorias são:");

        for(Conteudo conteudo : desenvolvedor.getConteudosInscritos()){
            System.out.println(conteudo);
        }
        System.out.println();

        increaseStudies();
    }

    public void increaseStudies(){
        boolean sairBootcamp = false;
        Scanner sc = new Scanner(System.in);

        while (!sairBootcamp){
            System.out.println();
            System.out.println("O que deseja fazer:");
            System.out.println("1 - Concluir um curso");
            System.out.println("0 - Sair");
            System.out.println();
            System.out.print("Opção:");
            int option = sc.nextInt();

            switch (option){
                case 1:
                    desenvolvedor.progredir();
                    System.out.println("Conteúdos contluídos para "
                            + desenvolvedor.getNome());
                    for(Conteudo conteudo : desenvolvedor.getConteudosConcluidos()){
                        System.out.println(conteudo);
                    }
                    System.out.println();
                    System.out.println("Conteúdos Restantes para "
                            + desenvolvedor.getNome());
                    for(Conteudo conteudo : desenvolvedor.getConteudosInscritos()){
                        System.out.println(conteudo);
                    }
                    System.out.println();
                    System.out.println("Seu XP atual é: " + desenvolvedor.calcularTotalXp());

                    if (desenvolvedor.getConteudosInscritos().isEmpty()){
                        sairBootcamp = true;
                        System.out.println("Parabens " + desenvolvedor.getNome()
                                + "! Você concluíu o bootcamp!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo......");
                    sairBootcamp = true;
                    System.out.println("Você se desincreveu do bootcamp");
                    break;

                    default:
                        System.err.println("Opção inválida!");


            }
        }
    }
}
