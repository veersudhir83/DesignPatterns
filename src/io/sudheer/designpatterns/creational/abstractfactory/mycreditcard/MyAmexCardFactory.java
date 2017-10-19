package io.sudheer.designpatterns.creational.abstractfactory.mycreditcard;

public class MyAmexCardFactory extends MyCardFactory {
	
	@Override
	public MyCard getCard(MyCardType cardType) {
		switch(cardType) {
			case GOLD: return new MyAmexGoldCard(); 
			case BLACK: return new MyAmexBlackCard(); 
			default: break;
		}
		return null;
	}
	
}
