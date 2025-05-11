package br.com.dougSys404.desafio.services;

import br.com.dougSys404.desafio.domain.Bootcamp;
import br.com.dougSys404.desafio.domain.Conteudo;
import br.com.dougSys404.desafio.domain.Curso;
import br.com.dougSys404.desafio.domain.Mentoria;

import java.util.LinkedHashSet;
import java.util.Set;

public class AuxiliaryFactory {

    Set<Curso> cursos = new LinkedHashSet<>();
    Set<Mentoria> mentorias = new LinkedHashSet<>();
    public Bootcamp bootcamp = new Bootcamp();

    public void alocateConteudo(){

        cursos.add(new Curso(
                "Java Puro!",
                "Aprendendo Java Puro!",
                80
        ));

        cursos.add(new Curso(
                "Java Script para Web!",
                "Aprendendo Java Script!",
                50
        ));


        mentorias.add(new Mentoria("Java Mentory", "Mentoria sobre java"));


        bootcamp.setNome("Bootcamp de Java 2025");
        bootcamp.setDescricao("Bootcamp para formar novos devs Java, 2025");


        bootcamp.getConteudos().addAll(cursos);
        bootcamp.getConteudos().addAll(mentorias);


    }


    public void init (){
        alocateConteudo();
    }


}
