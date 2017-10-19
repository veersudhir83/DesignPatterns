package io.sudheer.designpatterns.creational.abstractfactory.mycreditcard;

public class MyVisaCard extends MyCard {
	
	public MyVisaCard() {
	}
	
	@Override
	public void validateCard() {
		// code to validate visa card
		System.out.println("Validating Visa Credit Card");
	}
	
}
