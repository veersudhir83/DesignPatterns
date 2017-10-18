package io.sudheer.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

import io.sudheer.designpatterns.utils.Constants;

public class PrototypeExampleDemo {

	public static void main(String[] args) {

		String sql = Constants.CREATE_ADDRESS_TABLE;
		
		List<String> parameters = new ArrayList<>();
		parameters.add("star wars");
		Record record = new Record();
		
		PrototypeExample example = new PrototypeExample(sql, parameters, record);
		System.out.println("sql = " + example.getSql());
		System.out.println("parameters = " + example.getParameters());
		System.out.println("record = " + example.getRecord());
		
		PrototypeExample example2 = example.clone();
		System.out.println("sql = " + example2.getSql());
		System.out.println("parameters = " + example2.getParameters());
		System.out.println("record = " + example2.getRecord());
	}

}
