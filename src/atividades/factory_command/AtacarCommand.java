package atividades.factory_command;

public class AtacarCommand extends Command{

	@Override
	public void execute() {
		if (!GameReceiver.enemies.isEmpty()) {
			GameReceiver.atacar(GameReceiver.heroi, GameReceiver.enemies.get(0));
		} else {
			System.out.println("Não há inimigos para atacar.");
		}
	}
	
}
