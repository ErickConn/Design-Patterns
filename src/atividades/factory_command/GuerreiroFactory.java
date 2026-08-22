package atividades.factory_command;

public class GuerreiroFactory extends ClasseFactory{
	public Classe createClasse() {
		return new Guerreiro();
	}
}
