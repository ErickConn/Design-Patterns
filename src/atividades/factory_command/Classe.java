package atividades.factory_command;

public abstract class Classe {
    protected double hpmax = 100;
    protected double hpatual = hpmax;
    protected double forca = 20;
    protected String nome = "Heroi";
    protected HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial("Ataque Pesado", 30.0, 5);

    public String getNome() { return nome; }
    public double getHpmax() { return hpmax; }
    public double getHpatual() { return hpatual; }
    public void setHpatual(double hpatual) { this.hpatual = hpatual; }
    public double getForca() { return forca; }
    public HabilidadeEspecial getHabilidadeEspecial() { return habilidadeEspecial; }

    public String getName() { return nome; }

    public void mostrarStatus() {
        System.out.println("Status de " + nome + ": ");
        System.out.println("HP = " + hpatual + "/" + hpmax);
        System.out.println("Força = " + forca);
        System.out.println("Habilidade especial - "
                + habilidadeEspecial.getNome()
                + " | Dano: " + habilidadeEspecial.getDano()
                + " | Tempo de Recarga: " + habilidadeEspecial.getTempoRecarga());
    }

    public void atacar(Classe enemy) {
        System.out.println(nome + " ataca " + enemy.getNome() + " — dano: " + forca);
    }

    public void defender() {
        System.out.println(nome + " está defendendo");
    }

    public void usarHabilidade(Classe enemy) {
        System.out.println(nome + " usa " + habilidadeEspecial.getNome()
                + " em " + enemy.getNome()
                + " — dano: " + habilidadeEspecial.getDano());
    }
}
