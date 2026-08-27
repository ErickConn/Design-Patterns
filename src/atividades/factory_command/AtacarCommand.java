package atividades.factory_command;

public class AtacarCommand implements Command {

    private final GameReceiver receiver;

    public AtacarCommand(GameReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.atacar();
    }
}
