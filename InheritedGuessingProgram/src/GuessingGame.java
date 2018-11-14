import java.util.*;	// For Scanner Class

public class GuessingGame {
	public static void main(String[] args) {
		// To get user input
		Scanner input = new Scanner(System.in); 

		// Provide options
		System.out.println("Which game would you like to play?\n");
		System.out.println("Type 'r' for RandomNumberGuesser or");
		System.out.println("Type 'n' for classic NumberGuesser");
		
		// To play the original or the advanced random game
		if (input.nextLine().charAt(0) == ('r' | 'R')) {
			r();	// Uses RandomNumberGuesser game
		} else {
			n();	// Uses NumberGuesser game
		}
	}
		
	/**
	 * This is the RandomNumberGuesser game
	 */
	public static void r() {
		Scanner input = new Scanner(System.in);
		char playAgain;		// Holds value user input for y/n
		char answer;		// Holds value user input for h/l/c
		
		// Do-while loop can be exited if doesn't want to play
		do {
			// Create a RandomNumberGuesser object and set the lower and upper bound
			RandomNumberGuesser rng = new RandomNumberGuesser(1, 10);
			
			// Do-while loop can be exited if correct value
			do {
				System.out.print("Is it " + rng.getCurrentGuess() + "? (h/l/c) ");
				answer = input.nextLine().charAt(0);	// Holds user input
				// Uses the setValues overridden method to see if needs to decrease
				// or increase random value.
				rng.setValues(answer);
				
			// loops if not correct
			} while ((answer == 'h' || answer == 'l'));
			
			System.out.print("\n\nEnter y to play again or n to exit: ");
			playAgain = input.nextLine().charAt(0);
			
		} while (playAgain != ('n' | 'N'));
	}
	
	/**
	 * This is the classic NumberGuesser game
	 */
	public static void n() {
		Scanner input = new Scanner(System.in);
		char playAgain;	// Holds value user input for y/n
		char answer;	// Holds value user input for h/l/c
		
		// Do-while loop can be exited if doesn't want to play
		do {
			 // Create a NumberGuesser object with default constructor
			NumberGuesser ng = new NumberGuesser();
			
			// Do-while loop can be exited if correct value
			do {
				System.out.print("Is it " + ng.getCurrentGuess() + "? (h/l/c) ");
				answer = input.nextLine().charAt(0);	// Holds user input
				// Uses the setValues() method to calculate the midpoint value
				ng.setValues(answer);
				
			// loops if not correct
			} while ((answer == 'h' || answer == 'l'));
			
			System.out.print("\n\nEnter y to play again or n to exit: ");
			playAgain = input.nextLine().charAt(0);
			
		} while (playAgain != ('n' | 'N'));
	}
}


