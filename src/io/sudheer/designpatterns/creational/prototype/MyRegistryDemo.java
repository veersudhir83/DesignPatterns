package io.sudheer.designpatterns.creational.prototype;

public class MyRegistryDemo {

	public static void main(String[] args) {

		MyRegistry registry = new MyRegistry();
		MyMovie movie = (MyMovie) registry.createItem("Movie");
		movie.setTitle("Harry Potter");
		
		System.out.println(movie);
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());
		
		MyBook book = (MyBook) registry.createItem("Book");
		book.setTitle("Design Patterns");
		
		System.out.println(book);
		System.out.println(book.getTitle());
		System.out.println(book.getUrl());
	}

}
