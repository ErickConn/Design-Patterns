package atividades.factory_command;

public class HabilidadeEspecial {
    private final String nome;
    private final double dano;
    private final double tempoRecarga;

    public HabilidadeEspecial(String nome, double dano, double tempoRecarga) {
        this.nome = nome;
        this.dano = dano;
        this.tempoRecarga = tempoRecarga;
    }

    public String getNome() { return nome; }
    public double getDano() { return dano; }
    public double getTempoRecarga() { return tempoRecarga; }
}
