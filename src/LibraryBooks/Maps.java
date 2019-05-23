package LibraryBooks;

import java.util.ArrayList;

public class Maps extends Book {

	private String osLocation;

	public Maps(int pages, int volume, int edition, ArrayList<String> authors, String publisher, String osLocation) {
		super(pages, volume, edition, authors, publisher);
		this.osLocation = osLocation;
	}

	public String getOsLocation() {
		return osLocation;
	}

	public void setOsLocation(String osLocation) {
		this.osLocation = osLocation;
	}

}
