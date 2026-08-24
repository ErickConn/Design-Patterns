package com.erickconn.designpatterns.structural.decorator;

public class App {
	public static void main(String args[]) {
		System.out.println("[TESTE 1]: utilizar os métodos puros");
		DataSource source = new FileDataSource("hello.txt");
		source.writeData("123"); 
		source.readData();
		System.out.println();
		
		System.out.println("[TESTE 2]: utilizar os métodos + compressão e descompressão");
		source = new CompressionDecorator(source);
		source.writeData("123"); 
		source.readData();
		System.out.println();

		System.out.println("[TESTE 3]: utilizar os métodos + compressão e descompressão + encriptação e desencriptação");
		source = new EncryptionDecorator(source);
		source.writeData("123");
		source.readData();
	}
}
