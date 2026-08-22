package atividades.factory_command;

public class ArqueiroFactory extends ClasseFactory{
	public Classe createClasse() {
		return new Arqueiro();
	}
}
