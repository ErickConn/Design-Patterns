package atividades.factory_command;

import java.util.Map;
import java.util.HashMap;

public class CommandInvoker {

    private GameReceiver receiver;

    private final Map<String, Command> comandos = new HashMap<String, Command>();
    
    public CommandInvoker(GameReceiver receiver) {
        this.receiver = receiver;
        
        comandos.put("Atacar", new AtacarCommand(receiver));
        comandos.put("Defender", new DefenderCommand(receiver));
        comandos.put("Status", new MostrarStatusCommand(receiver));
        comandos.put("Habilidade", new UsarHabilidadeCommand(receiver));
    }

    public void invoke(String nomeComando) {
        Command command = comandos.get(nomeComando);
        if (command == null) {
            System.out.println("Comando inválido: "+ nomeComando);
            return;
        }
        command.execute();
    }
}
