package com.erickconn.designpatterns.structural.decorator;


public class EncryptionDecorator extends DataSourceDecorator {

	public EncryptionDecorator(DataSource s) {
		super(s);
	}

	@Override
	public void readData() {
		System.out.println("Desencrypt data");
		super.readData();
	}

	@Override
	public void writeData(String data) {
		System.out.println("Encrypt data");
		super.writeData(data);
	}
}
