package atividades.factory_command;

//Considere um jogo de RPG em que os jogadores podem criar personagens com diferentes classes, como guerreiro, feiticeira, arqueiro, entre outras. Cada classe possui habilidades e ações específicas.
//O desafio é projetar um sistema que permita tanto a criação de personagens de forma flexível e extensível quanto a representação das ações realizadas pelos personagens como objetos independentes.

//Utilize o padrão Factory Method para criar diferentes classes de personagens. Cada classe concreta de personagem deve implementar uma interface ou herdar de uma classe abstrata comum, 
//permitindo que o sistema trabalhe com diferentes personagens sem conhecer os detalhes específicos de sua implementação. 
//Crie pelo menos 3 classes de personagens, sendo que cada tipo deve possuir características próprias, como pontos de vida, força e habilidades específicas.

//Utilize o padrão Command para representar as ações que os personagens podem realizar durante o jogo. Implemente pelo menos 3 comandos diferentes, como atacar, defender, usar uma habilidade especial.
//Cada comando deve encapsular uma solicitação e estar associado ao personagem que realizará a ação. O sistema deve possuir uma classe responsável por receber e executar os comandos.

//Para testar, crie uma classe executável Cliente demonstrando que você testou tudo o que construiu. Você deve incluir comentários indicando o que está sendo testado em cada chamada de método. 
//Nesse teste, crie pelo menos três personagens de classes diferentes, execute pelo menos três tipos diferentes de comandos, demonstrando que personagens diferentes executam comandos diferentes através 
//de uma interface comum. Exiba no console informações que permitam acompanhar a criação dos personagens, os comandos executados e as alterações provocadas no estado dos personagens.

public class Client {

	public static void main(String[] args) {

		System.out.println("TESTE - Factory Method + Command Pattern RPG");
		
		System.out.println();

		ClasseFactory factory = new GuerreiroFactory();
		Classe guerreiro = factory.createClasse();
		System.out.println("[Factory] Personagem criado: " + guerreiro.getName());
		guerreiro.mostrarStatus();
		
		System.out.println();

		factory = new ArqueiroFactory();
		Classe arqueiro = factory.createClasse();
		System.out.println("[Factory] Personagem criado: " + arqueiro.getName());
		arqueiro.mostrarStatus();
		
		System.out.println();


		factory = new MagoFactory();
		Classe mago = factory.createClasse();
		System.out.println("[Factory] Personagem criado: " + mago.getName());
		mago.mostrarStatus();
		
		System.out.println();

		Classe inimigo = new Guerreiro();
		inimigo.nome = "Inimigo Teste";
		System.out.println("Inimigo de teste criado: " + inimigo.nome);
		System.out.println("HP inicial do inimigo: " + inimigo.hpatual + "/" + inimigo.hpmax);
		
		System.out.println();

		GameReceiver.heroi = guerreiro;
		GameReceiver.enemies.clear();
		GameReceiver.enemies.add(inimigo);

		System.out.println("[Invoker] Invocando 'Atacar' com " + guerreiro.getName() + ":");
		System.out.println("HP do inimigo antes: " + inimigo.hpatual);
		Command atacar = new AtacarCommand();
		atacar.execute(); 
		System.out.println("HP do inimigo depois: " + inimigo.hpatual);

		System.out.println();

		System.out.println("[Invoker] Invocando 'Defender' com " + mago.getName() + ":");
		GameReceiver.heroi = arqueiro;
		Command defender = new DefenderCommand();
		defender.execute();

		System.out.println();

		System.out.println("[Invoker] Invocando 'Habilidade' com " + mago.getName() + ":");
		GameReceiver.heroi = mago;
		
		System.out.println("HP do inimigo antes: " + GameReceiver.enemies.get(0).hpatual);
		Command habilidade = new UsarHabilidadeCommand();
		habilidade.execute();
		
		System.out.println("[Invoker] Invocando 'Status' com " + arqueiro.getName() + ":");
		GameReceiver.heroi = arqueiro;
		Command status = new MostrarStatusCommand();
		status.execute();
		
		System.out.println();

		GameReceiver.heroi = guerreiro;

		System.out.println("[Invoker] Invocando 'Atacar' com " + guerreiro.getName() + ":");
		CommandInvoker.invoke("Atacar");
		
		System.out.println("[Invoker] Invocando 'Defender' com " + guerreiro.getName() + ":");
		CommandInvoker.invoke("Defender");
		
		System.out.println("[Invoker] Invocando comando inexistente com " + guerreiro.getName() + ":");
		CommandInvoker.invoke("Fugir"); 

	}

}

