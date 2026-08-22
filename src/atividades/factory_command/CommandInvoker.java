package atividades.factory_command;
import java.util.Map;
import java.util.HashMap;

public class CommandInvoker {
	static Map<String, Command> comandos = new HashMap<String, Command>();
	
	static {
		comandos.put("Atacar", new AtacarCommand());
		comandos.put("Defender", new DefenderCommand());
		comandos.put("Status", new MostrarStatusCommand());
		comandos.put("Habilidade", new UsarHabilidadeCommand());
	}
	
	public static void invoke(String comando) {
		try {
			Command c = comandos.get(comando);
			c.execute();
			
		} catch(NullPointerException e) {
			System.err.println("Comando inválido");
		}
	}
}
