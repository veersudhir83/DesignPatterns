package io.sudheer.designpatterns.creational.abstractfactory.mycreditcard;

public class MyVisaCardFactory extends MyCardFactory {
	
	@Override
	public MyCard getCard(MyCardType cardType) {
		switch(cardType) {
			case GOLD: return new MyVisaGoldCard(); 
			case PLATINUM: return new MyVisaPlatinumCard(); 
			default: break;
		}
		return null;
	}
	
}
