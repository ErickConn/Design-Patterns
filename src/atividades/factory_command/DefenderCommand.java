package atividades.factory_command;

public class DefenderCommand extends Command{

	@Override
	public void execute() {
		GameReceiver.defender(GameReceiver.heroi);
		
	}

}
