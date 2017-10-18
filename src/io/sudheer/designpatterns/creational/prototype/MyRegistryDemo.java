package io.sudheer.designpatterns.creational.prototype;

public class MyRegistryDemo {

	public static void main(String[] args) {

		MyRegistry registry = new MyRegistry();
		MyMovie movie = (MyMovie) registry.createItem("Movie");
		movie.setTitle("Harry Potter");
		
		System.out.println(movie);
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());
		
		MyMovie movie2 = (MyMovie) registry.createItem("Movie");
		movie2.setTitle("Harry Potter 2");
		
		System.out.println(movie2);
		System.out.println(movie2.getTitle());
		System.out.println(movie2.getUrl());
		
	}

}
