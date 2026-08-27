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

        System.out.println("TESTE - Factory Method + Command Pattern RPG ");
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
        System.out.println("[Inimigo] Criado: " + inimigo.getName());
        System.out.println("[Inimigo] HP inicial: " + inimigo.getHpatual() + "/" + inimigo.getHpmax());
        System.out.println();

        GameReceiver receiver = new GameReceiver(guerreiro);
        receiver.addEnemy(inimigo);

        System.out.println("[Command] Guerreiro executa 'Atacar':");
        System.out.println("  HP do inimigo antes: " + inimigo.getHpatual());
        Command atacar = new AtacarCommand(receiver);
        atacar.execute();
        System.out.println("  HP do inimigo depois: " + inimigo.getHpatual());
        System.out.println();

        receiver.setHeroi(arqueiro); // troca o herói ativo — inimigo continua na lista
        System.out.println("[Command] Arqueiro executa 'Defender':");
        Command defender = new DefenderCommand(receiver);
        defender.execute();
        System.out.println();

        receiver.setHeroi(mago); // troca para Mago
        System.out.println("[Command] Mago executa 'Habilidade Especial':");
        System.out.println("  HP do inimigo antes: " + inimigo.getHpatual());
        Command habilidade = new UsarHabilidadeCommand(receiver);
        habilidade.execute();
        System.out.println("  HP do inimigo depois: " + inimigo.getHpatual());
        System.out.println();

        receiver.setHeroi(arqueiro); // volta para Arqueiro para mostrar status
        System.out.println("[Command] Arqueiro executa 'Status':");
        Command status = new MostrarStatusCommand(receiver);
        status.execute();
        System.out.println();

        System.out.println("Testando CommandInvoker com Guerreiro contra Mago:");

        Classe inimigo2 = new Mago();
        receiver.setHeroi(guerreiro); // troca para Guerreiro
        receiver.clearEnemies();
        receiver.addEnemy(inimigo2);

        CommandInvoker invoker = new CommandInvoker(receiver);

        System.out.println("[Invoker] Guerreiro 'Atacar':");
        invoker.invoke("Atacar");

        System.out.println("[Invoker] Guerreiro 'Defender':");
        invoker.invoke("Defender");

        System.out.println("[Invoker] Guerreiro  'Fugir' (comando inexistente):");
        invoker.invoke("Fugir");
    }
}
