package io.sudheer.designpatterns.creational.abstractfactory.mycreditcard;

public class MyAmexCard extends MyCard {
	
	public MyAmexCard() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void validateCard() {
		// code to validate visa card
		System.out.println("Validating Amex Credit Card");
	}
}
