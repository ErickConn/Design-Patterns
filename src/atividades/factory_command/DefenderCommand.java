package atividades.factory_command;

public class DefenderCommand implements Command {

    private final GameReceiver receiver;

    public DefenderCommand(GameReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.defender();
    }
}
