package atividades.factory_command;

public class MostrarStatusCommand implements Command {

    private final GameReceiver receiver;

    public MostrarStatusCommand(GameReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.mostrarStatus();
    }
}
