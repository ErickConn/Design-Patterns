package com.erickconn.designpatterns.creational.builder;

public class ComputadorDirector {

 public void construirGamer(ComputadorBuilder builder) {
     builder.setProcessador("AMD Ryzen 7 7800X3D");
     builder.setMemoriaRAM("32GB DDR5 6000MHz");
     builder.setSSD("2TB NVMe M.2");
     builder.setPlacaVideo("NVIDIA GeForce RTX 4080");
 }

 public void construirEscritorio(ComputadorBuilder builder) {
     builder.setProcessador("Intel Core i3-12100");
     builder.setMemoriaRAM("8GB DDR4 3200MHz");
     builder.setSSD("256GB SSD SATA");
     builder.setPlacaVideo("Gráficos Integrados UHD");
 }

 public void construirServidorBasico(ComputadorBuilder builder) {
     builder.setProcessador("Intel Xeon E-2324");
     builder.setMemoriaRAM("64GB ECC DDR4");
     builder.setSSD("2x 1TB SSD Enterprise");
     builder.setPlacaVideo("Integrada Básica");
 }
 
}
