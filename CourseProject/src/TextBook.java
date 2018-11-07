/**
 * This class stores data about a textbook
 * @author imald
 *
 */
public class TextBook {
	private String title;
	private String author;
	private String publisher;
	
	/**
	 * 
	 * @param textTitle
	 * @param auth
	 * @param pub
	 */
	public TextBook(String textTitle, String auth, String pub) {
		title = textTitle;
		author = auth;
		publisher = pub;
	}
	
	/**
	 * 
	 * @param object2
	 */
	public TextBook(TextBook object2) {
		title = object2.title;
		author = object2.author;
		publisher = object2.publisher;
	}
	
	/**
	 * 
	 * @param textTitle
	 * @param auth
	 * @param pub
	 */
	public void set(String textTitle, String auth, String pub) {
		title = textTitle;
		author = auth;
		publisher = pub;
	}
	
	/**
	 * @return A tring containing the textbook information
	 */
	public String toString() {
		String str = "Title: " + title +
				"\nAuthor: " + author +
				"\nPublisher: " + publisher;
		return str;
	}
}
