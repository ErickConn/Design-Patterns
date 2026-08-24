package com.erickconn.designpatterns.structural.decorator;

public class DataSourceDecorator implements DataSource {

	private DataSource wrapper;

	public DataSourceDecorator(DataSource s) {
		this.wrapper = s;
	}

	@Override
	public void readData() {
		wrapper.readData();
	}

	@Override
	public void writeData(String data) {
		wrapper.writeData(data);
	}
}
