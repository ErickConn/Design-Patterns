package atividades.factory_command;

public class MagoFactory extends ClasseFactory{
	public Classe createClasse() {
		return new Mago();
	}
}
