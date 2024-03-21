package app04;

import java.util.ArrayList;
import java.util.List;

public class BookRepo {
	private List<Book> bookList;
	
	public BookRepo() {
		bookList = new ArrayList<>();
		bookList.add(new Book("파워자바", 20000));
		bookList.add(new Book("Doit!", 12000));
		bookList.add(new Book("ㅋㅋ", 3000000));
	}
	
	public List<Book> getBookList() {
		return bookList;
	}
}
