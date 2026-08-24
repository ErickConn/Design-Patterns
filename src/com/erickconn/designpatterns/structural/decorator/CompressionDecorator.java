package com.erickconn.designpatterns.structural.decorator;

public class CompressionDecorator extends DataSourceDecorator {

	public CompressionDecorator(DataSource s) {
		super(s);
	}

	@Override
	public void readData() {
		System.out.println("Descompressing data");
		super.readData();
	}

	@Override
	public void writeData(String data) {
		System.out.println("Compressing data");
		super.writeData(data);
	}
}
