package io.sudheer.designpatterns.creational.builder;

public class MyLunchBuilderDemo {

	public static void main(String[] args) {
		
		MyLunchBuilder.Builder builder = new MyLunchBuilder.Builder();
		
		// Any of the below will work - allows to build the order the way we want without forcing the user to 
		// select an option for a category
		
		//builder.bread("Oregano").condiments("Lettuce").dressing("Mayo").meat("Turkey");
		//builder.bread("Oregano").dressing("Mayo").meat("Turkey");
		builder.bread("Oregano").meat("Turkey");
		
		MyLunchBuilder order = builder.build();
		System.out.println("Bread=" + order.getBread());
		System.out.println("Condiments=" + order.getCondiments());
		System.out.println("Dressing=" + order.getDressing());
		System.out.println("Meat=" + order.getMeat());
	}

}
