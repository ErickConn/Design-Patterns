package atividades.factory_command;

public class MostrarStatusCommand extends Command{
	public void execute() {
		GameReceiver.mostrarStatus(GameReceiver.heroi);
	}
}
