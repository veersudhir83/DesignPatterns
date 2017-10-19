package io.sudheer.designpatterns.creational.abstractfactory.mycreditcard;

public class MyCardFactoryDemo {

	public static void main(String[] args) {

		MyCardFactory abstractFactory = MyCardFactory.getCardFactory(775);
		MyCard card = abstractFactory.getCard(MyCardType.GOLD);
		System.out.println(card.getClass());
		
		MyCardFactory abstractFactory2 = MyCardFactory.getCardFactory(749);
		MyCard card2 = abstractFactory2.getCard(MyCardType.GOLD);
		System.out.println(card2.getClass());
		
	}

}
