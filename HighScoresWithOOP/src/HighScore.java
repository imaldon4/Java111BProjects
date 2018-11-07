/**
 * This class provides getters and setters for a
 * HighScore object. 
 * @author Ike Maldonado
 * @version 10/16/18
 *
 */
public class HighScore {
	//Fields 
	private String name;
	private int score;
	
	/**
	 * Constructor to set name and score
	 * @param n The name 
	 * @param s The score
	 */
	public HighScore(String n, int s) {
		name = n;
		score = s;
	}
	
	/**
	 * Sets the name
	 * @param n The name
	 */
	public void setName(String n) {
		name = n;
	}
	
	/**
	 * Gets the name
	 * @return name Returns the name value
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the score
	 * @param s The score
	 */
	public void setScore(int s) {
		score = s;
	}
	
	/**
	 * Gets the score
	 * @return score Returns the score value
	 */
	public int getScore() {
		return score;
	}
}
