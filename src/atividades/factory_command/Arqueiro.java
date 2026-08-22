package atividades.factory_command;

public class Arqueiro extends Classe{

    public Arqueiro(){
        this.nome = "Arqueiro";
        this.hpmax = 95;
        this.hpatual = 95;
        this.forca = 22;
        this.habilidadeEspecial = new HabilidadeEspecial("Chuva de Flechas", 40.0, 4);
    }
	
	public String getName() {
        return "Arqueiro";
    }
}
