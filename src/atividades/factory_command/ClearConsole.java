package atividades.factory_command;

public class ClearConsole {
	public static void clearConsole() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int i = 0;
		while (i < 35) {
			System.out.println("");
			i++;
		}
	}
}
