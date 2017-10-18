package io.sudheer.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class MyRegistry {
	
	private Map<String, MyItem> items = new HashMap<String, MyItem>();
	
	public MyRegistry() {
		loadItems();
	}
	
	public MyItem createItem(String type) {
		MyItem item = null;
		
		try {
			item = (MyItem) (items.get(type).clone());
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return item;
	}

	private void loadItems() {

		MyMovie movie = new MyMovie();
		movie.setTitle("Lucy");
		movie.setPrice(69.99);
		movie.setUrl("imdb.com/lucy");
		movie.setRuntime("120.23");
		items.put("Movie", movie);
		
		MyBook book = new MyBook();
		book.setTitle("Design Patterns");
		book.setPrice(99.99);
		book.setUrl("digit.com/design_patterns");
		book.setNumberOfPages(123);
		items.put("Book", book);
	}
	
}
