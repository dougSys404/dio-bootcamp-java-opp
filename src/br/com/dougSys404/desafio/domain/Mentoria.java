package br.com.dougSys404.desafio.domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20.0;
    }



    @Override
    public String toString() {
        return "Mentoria{" +
                ", titulo = '" + getTitulo() + '\'' +
                ", descricao = '" + getDescricao() + '\'' +
                ", data = " + data +
                '}';
    }


}
