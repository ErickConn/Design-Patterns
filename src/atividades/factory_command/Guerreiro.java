package atividades.factory_command;

public class Guerreiro extends Classe {

    public Guerreiro() {
        this.nome = "Guerreiro";
        this.hpmax = 110;
        this.hpatual = 110;
        this.forca = 25;
        this.habilidadeEspecial = new HabilidadeEspecial("Fúria Berserker", 50.0, 6);
    }
}
