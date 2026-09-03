package com.erickconn.designpatterns.creational.builder;

public class Client {
    public static void main(String[] args) {
        ComputadorDirector director = new ComputadorDirector();
        ComputadorConcretoBuilder builder = new ComputadorConcretoBuilder();

        director.construirGamer(builder);
        Computador pcGamer = builder.getResultado();

        director.construirEscritorio(builder);
        Computador pcEscritorio = builder.getResultado();

        builder.setProcessador("AMD Ryzen 5 5600");
        builder.setMemoriaRAM("16GB DDR4");
        builder.setSSD("1TB NVMe");
        builder.setPlacaVideo("AMD Radeon RX 6600");
        Computador pcCustom = builder.getResultado();

        System.out.println("PC Gamer:\n" + pcGamer + "\n");
        System.out.println("PC Escritório:\n" + pcEscritorio + "\n");
        System.out.println("PC Customizado:\n" + pcCustom);
    }
}
