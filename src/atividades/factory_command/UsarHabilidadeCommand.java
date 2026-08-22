package atividades.factory_command;

public class UsarHabilidadeCommand extends Command{

	@Override
	public void execute() {
		if (!GameReceiver.enemies.isEmpty()) {
			GameReceiver.usarHabilidadeEspecial(GameReceiver.heroi, GameReceiver.enemies.get(0));
		} else {
			System.out.println("Não há inimigos para usar a habilidade.");
		}
	}
	
}
