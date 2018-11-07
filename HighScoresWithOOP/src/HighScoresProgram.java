import java.util.*;

/**
 * This Main class initializes a HighScore[] array object, sorts,
 * and returns the sorted array of names and scores.
 * @author Ike Maldonado
 * @version 10/16/18
 *
 */
public class HighScoresProgram {
	public static void main(String args[]) {
		final int TOTAL_PEOPLE = 5;
		
		//Allocate an array of 5 HighScore references to hs object
		HighScore[] hs = new HighScore[TOTAL_PEOPLE];
		
		//Calls initialize() method and asks user to enter info
		initialize(hs);
		
		//Sorts score via BubbleSort and pairs name with score
		sort(hs);
		
		//Loops to display all objects 'name' and 'score'
		display(hs);
		
		System.exit(0);
	}
	
	/**
	 * Sets name and scores using HighScore Class
	 * @param scores Refers to HighScore[] object 'hs'
	 */
	public static void initialize(HighScore[] scores) {
		//Use Scanner class to take in user input at the command line
		Scanner keyboard = new Scanner(System.in);
		String name;		//Holds the name 
		int s;				//Holds the score
		
		//Use for loop to take in input for array number of items
		for (int i = 0; i < scores.length; i++) {
			//Request user for name
			System.out.print("Enter name for score #" + (i+1) + ": ");
			name = keyboard.nextLine();
			//Request user for score
			System.out.print("Enter score for score #" + (i+1) + ": ");
			s = keyboard.nextInt();
			
			//Passes the name and score to the score[] object at that index
			scores[i] = new HighScore(name, s);
			keyboard.nextLine();		//Consumes remaining line
		}
	}
	
	
	/**
	 * Bubble sort setting scores paired with name by ascending order
	 * @param scores Object of HighScore
	 */
	public static void sort(HighScore[] scores) {
		int n = scores.length;			//Length of scores array
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				//Test to see whether score at index is less than score
				//at next index.
				if(scores[j].getScore() > scores[j+1].getScore()) {
					int temp = scores[j].getScore();		//Assign score to temp
					String temporary = scores[j].getName();	//Assign name to temporary
					
					//Set name and score to next index
					scores[j].setScore(scores[j+1].getScore());
					scores[j].setName(scores[j+1].getName());
					
					//Set name and score at next index to previous index
					scores[j+1].setScore(temp);
					scores[j+1].setName(temporary);
				}
			}
		}
	}
	
	/**
	 * This method displays all names and scores in the 'hs' object
	 * @param scores Refers to the 'hs' HighScore[] object
	 */
	public static void display(HighScore[] scores) {
		//Use for loop to print each name and score at index i
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i].getName() + "\t" + scores[i].getScore());
		}
	}
}
