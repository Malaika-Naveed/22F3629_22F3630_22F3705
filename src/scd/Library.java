package scd;

import java.util.ArrayList;
import java.util.List;

public class Library {
	List<String> books = new ArrayList<>();

	public void addBokk(String title) {
		books.add(title);
		System.out.println(title + "Book Added to Library.");
	}

	public void listBooks() {
		System.out.println("Books in Library: " + books);
	}
	public boolean searchBook(String bookName) {
		return books.contains(bookName);
		}
}
