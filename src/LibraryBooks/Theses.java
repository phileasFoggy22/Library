package LibraryBooks;

import java.awt.print.Book;

public class Theses extends Book {

	private String genre;
	private String topic;
	private String mainAuthor;

	public Theses(String genre, String topic, String mainAuthor) {
		super();
		this.genre = genre;
		this.topic = topic;
		this.mainAuthor = mainAuthor;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getMainAuthor() {
		return mainAuthor;
	}

	public void setMainAuthor(String mainAuthor) {
		this.mainAuthor = mainAuthor;
	}

}
