package atividades.factory_command;
import java.util.Vector;

public class GameReceiver {
	public static Classe heroi;
	public static Vector<Classe> enemies = new Vector<>();
	private static int fase = 0;
	
	public static void mostrarStatus(Classe heroi) {
		heroi.mostrarStatus();
	}
	
	public static void atacar(Classe heroi, Classe enemy) {
		heroi.atacar(enemy);
		enemy.hpatual -= heroi.forca;
		System.out.println(enemy.nome + " HP restante: " + enemy.hpatual);
		if (enemy.hpatual <= 0) {
			System.out.println(enemy.nome + " foi derrotado!");
			enemies.remove(enemy);
		}
	}
	
	public static void defender(Classe heroi) {
		heroi.defender();
	}
	
	public static void usarHabilidadeEspecial(Classe heroi, Classe enemy) {
		heroi.usarHabilidade(enemy);
		enemy.hpatual -= heroi.habilidadeEspecial.dano;
		System.out.println(enemy.nome + " HP restante: " + enemy.hpatual);
		if (enemy.hpatual <= 0) {
			System.out.println(enemy.nome + " foi derrotado!");
			enemies.remove(enemy);
		}
	}

}
