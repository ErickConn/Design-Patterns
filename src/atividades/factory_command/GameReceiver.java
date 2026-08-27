package atividades.factory_command;

import java.util.ArrayList;
import java.util.List;

public class GameReceiver {

    private Classe heroi;
    private final List<Classe> enemies = new ArrayList<>();

    public GameReceiver(Classe heroi) {
        this.heroi = heroi;
    }
 

    public Classe getHeroi() { return heroi; }
    public void setHeroi(Classe heroi) { this.heroi = heroi; }
    public List<Classe> getEnemies() { return enemies; }

    public void addEnemy(Classe enemy) { enemies.add(enemy); }
    public void clearEnemies() { enemies.clear(); }


    public void mostrarStatus() {
        heroi.mostrarStatus();
    }

    public void atacar() {
        if (enemies.isEmpty()) {
            System.out.println("Não há inimigos para atacar.");
            return;
        }
        Classe alvo = enemies.get(0);
        heroi.atacar(alvo);
        alvo.setHpatual(alvo.getHpatual() - heroi.getForca());
        if (alvo.getHpatual() <= 0) {
            System.out.println(alvo.getNome() + " foi derrotado!");
            enemies.remove(alvo);
        }
    }

    public void defender() {
        heroi.defender();
    }

    public void usarHabilidadeEspecial() {
        if (enemies.isEmpty()) {
            System.out.println("Não há inimigos para usar a habilidade.");
            return;
        }
        Classe alvo = enemies.get(0);
        heroi.usarHabilidade(alvo);
        alvo.setHpatual(alvo.getHpatual() - heroi.getHabilidadeEspecial().getDano());
        if (alvo.getHpatual() <= 0) {
            System.out.println(alvo.getNome() + " foi derrotado!");
            enemies.remove(alvo);
        }
    }
}
