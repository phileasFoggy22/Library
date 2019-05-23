package main;

import java.util.ArrayList;

import LibraryBooks.FictionalBooks;

public class Runner {
	public static void main(String[] args) {
		ArrayList<String> authors = new ArrayList<String>();
		authors.add("David Mitchell");
		FictionalBooks book1 = new FictionalBooks(456, 1, 1, authors, "Cloud Atlas", "Science Fiction");
		authors.removeAll(authors);
		authors.add("Neil Gaiman");
		FictionalBooks book2 = new FictionalBooks(654, 1, 2, authors, "American Gods", "Science Fiction");
		authors.removeAll(authors);
		authors.add("George Martin");
		FictionalBooks book3 = new FictionalBooks(5432, 1, 2, authors, "Game of Thrones", "Fiction Fantasy");
		authors.removeAll(authors);

	};

}
