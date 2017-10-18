package io.sudheer.designpatterns.creational.factory.mywebsite;

public class MyBlog extends MyWebSite {

	@Override
	public void createMyWebSite() {

		pages.add(new CartPage());
		pages.add(new CommentsPage());
		
	}

}
