package io.sudheer.designpatterns.creational.factory.mywebsite;

public class MyShop extends MyWebSite {

	@Override
	public void createMyWebSite() {
		pages.add(new CartPage());
		pages.add(new ItemsPage());
		pages.add(new SearchPage());
	}

}
