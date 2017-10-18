package io.sudheer.designpatterns.creational.factory.mywebsite;

public class MyWebSiteFactoryDemo {

	public static void main(String[] args) {

		MyWebSite blogSite = MyWebSiteFactory.getWebSite(MyWebSiteType.BLOG);
		System.out.println(blogSite.getPages());
		
		MyWebSite shopSite = MyWebSiteFactory.getWebSite(MyWebSiteType.SHOP);
		System.out.println(shopSite.getPages());
		
	}

}
