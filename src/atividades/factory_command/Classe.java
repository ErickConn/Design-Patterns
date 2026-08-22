package atividades.factory_command;

public abstract class Classe {
	protected double hpmax = 100;
	protected double hpatual = hpmax;
	protected double forca = 20;
	protected String nome = "Heroi";
	protected HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial("Ataque Pesado", 30.0, 5);
	
	public void mostrarStatus() {
		System.out.println("Status de " + nome + ": ");
		System.out.println("HP = " + hpatual + "/" + hpmax);
		System.out.println("Força = " + forca);
		System.out.println("Habilidade especial - " + habilidadeEspecial.nome + "| Dano: " + habilidadeEspecial.dano + "| Tempo de Recarga: " + habilidadeEspecial.tempoRecarga);
	}
	
	public void atacar(Classe enemy) {
		System.out.println("Atacando - dano: " + forca);
	}
	
	public void defender() {
		System.out.println("Defendendo");
	}
	
	public void usarHabilidade(Classe enemy) {
		System.out.println("Usando habilidade " +  this.habilidadeEspecial.nome);
		System.out.println("Irá causar " + this.habilidadeEspecial.dano + " de dano");
	}

	protected abstract String getName();
}
