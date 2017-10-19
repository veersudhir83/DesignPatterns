package io.sudheer.designpatterns.creational.abstractfactory.mycreditcard;

public abstract class MyCardFactory {

	public static MyCardFactory getCardFactory(int creditScore) {

		if(creditScore > 750) {
			return new MyAmexCardFactory();
		} else {
			return new MyVisaCardFactory();
		}
		
	}	
	
	public abstract MyCard getCard(MyCardType cardType);
	
}
