
public class Course {
	private String courseName;
	private Instructor instructor;
	private TextBook textBook;
	
	/**
	 * 
	 * @param name
	 * @param instr
	 * @param text
	 */
	public Course(String name, Instructor instr, TextBook text) {
		courseName = name;
		
		instructor = new Instructor(instr);
		textBook = new TextBook(text);
	}
	
	/**
	 * Returns coursename
	 * @return
	 */
	public String getName() {
		return courseName;
	}
	
	/**
	 * Returns a reference copy of the instructor object
	 * @return
	 */
	public Instructor getInstructor() {
		return new Instructor(instructor);
	}
	
	/**
	 * Returns a reference copy of the instructor object
	 * @return
	 */
	public TextBook getTextBook() {
		return new TextBook(textBook);
	}
	
	public String toString() {
		String str = "Course name: " + courseName +
				"\nInstructor Information: " + 
				instructor +
				"\nTextbook Information: " +
				textBook;
		return str;
	}
}
