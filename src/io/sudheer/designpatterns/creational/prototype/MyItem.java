package io.sudheer.designpatterns.creational.prototype;

public abstract class MyItem implements Cloneable {

	private String title;
	private double price;
	private String url;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public double getPrice() {
		return price;
	}
	public String getTitle() {
		return title;
	}
	public String getUrl() {
		return url;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
