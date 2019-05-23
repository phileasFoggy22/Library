package LibraryBooks;

import java.util.ArrayList;

public class FictionalBooks extends Book {

	private String genre;

	public FictionalBooks(int pages, int volume, int edition, ArrayList<String> authors, String publisher,
			String genre) {
		super(pages, volume, edition, authors, publisher);
		this.genre = genre;
	}

	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
}
