package atividades.factory_command;

public class Mago extends Classe {

    public Mago() {
        this.nome = "Mago";
        this.hpmax = 90;
        this.hpatual = 90;
        this.forca = 20;
        this.habilidadeEspecial = new HabilidadeEspecial("Bola de Fogo", 45.0, 3);
    }
}
