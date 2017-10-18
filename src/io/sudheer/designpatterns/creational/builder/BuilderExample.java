package io.sudheer.designpatterns.creational.builder;

public class BuilderExample {

	public static void main(String[] args) {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("This is an ");
		strBuilder.append("example of a ");
		strBuilder.append("StringBuilder which uses ");
		strBuilder.append("Builder".toUpperCase()).append(" pattern");
		System.out.println(strBuilder.toString());
	}

}
