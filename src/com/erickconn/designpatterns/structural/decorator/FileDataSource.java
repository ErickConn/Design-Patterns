package com.erickconn.designpatterns.structural.decorator;


public class FileDataSource implements DataSource {

	private String filename;

	public FileDataSource(String filename) {
		this.filename = filename;
	}

	@Override
	public void readData() {
		System.out.println("Read archive data");
	}

	@Override
	public void writeData(String data) {
		System.out.println("Write "+ data + " to archive");
	}
}
