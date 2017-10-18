package io.sudheer.designpatterns.creational.factory.mywebsite;

import java.util.ArrayList;
import java.util.List;

public abstract class MyWebSite {

	protected List<Page> pages = new ArrayList<>();
	
	public MyWebSite() {
		this.createMyWebSite();
	}
	
	public abstract void createMyWebSite();

	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}
	
}
