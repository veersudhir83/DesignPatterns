package io.sudheer.designpatterns.creational.factory.mywebsite;

public class MyWebSiteFactory {

	public static MyWebSite getWebSite(MyWebSiteType siteType) {
		switch(siteType) {
			case BLOG: return new MyBlog();
			case SHOP: return new MyShop();
			default: return null;
		}
	}
	
}
