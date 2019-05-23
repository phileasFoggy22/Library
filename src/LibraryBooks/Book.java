package LibraryBooks;

import java.util.ArrayList;

public abstract class Book {
	private int pages;
	private int volume;
	private int edition;
	private ArrayList<String> authors = new ArrayList<String>();
	private String title;

	public Book(int pages, int volume, int edition, ArrayList<String> authors, String title) {
		this.pages = pages;
		this.volume = volume;
		this.edition = edition;
		this.authors = authors;
		this.title = title;
	}

	public int getPages() {
		return this.pages;
	}

	public int getVolume() {
		return this.volume;
	}

	public int getEdition() {
		return this.edition;
	}

	public ArrayList<String> getAuthorList() {
		return this.authors;
	}

	public String getTitle() {
		return this.title;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
