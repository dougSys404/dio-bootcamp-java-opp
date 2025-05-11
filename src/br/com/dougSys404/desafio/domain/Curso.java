package br.com.dougSys404.desafio.domain;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso(){}

    public Curso(String titulo, String descricao, int cargaHoraria) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                " titulo = '" + getTitulo() + '\'' +
                ", descricao = '" + getDescricao() + '\'' +
                ", cargaHoraria = " + cargaHoraria +
                " }";
    }
}
