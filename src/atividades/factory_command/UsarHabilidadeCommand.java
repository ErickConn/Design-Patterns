package atividades.factory_command;

public class UsarHabilidadeCommand implements Command {

    private final GameReceiver receiver;

    public UsarHabilidadeCommand(GameReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.usarHabilidadeEspecial();
    }
}
