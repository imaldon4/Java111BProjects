import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.println("Which game would you like to play?\n");
		System.out.println("Type 'r' for RandomNumberGuesser or");
		System.out.println("Type 'n' for classic NumberGuesser");
		
		if (input.nextLine().charAt(0) == ('r' | 'R')) {
			r();
		} else {
			n();
		}
	}
		
	/**
	 * This is the RandomNumberGuesser game
	 */
	public static void r() {
		
		Scanner input = new Scanner(System.in);
		char playAgain;
		char answer;
		do {
			RandomNumberGuesser rng = new RandomNumberGuesser(1, 10);
			do {
				System.out.print("Is it " + rng.getCurrentGuess() + "? (h/l/c) ");
				answer = input.nextLine().charAt(0);
				rng.setValues(answer);
				
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

		char playAgain;
		char answer;
		do {
			NumberGuesser ng = new NumberGuesser();
			do {
				System.out.print("Is it " + ng.getCurrentGuess() + "? (h/l/c) ");
				answer = input.nextLine().charAt(0);
				ng.setValues(answer);
				
			} while ((answer == 'h' || answer == 'l'));
			
			System.out.print("\n\nEnter y to play again or n to exit: ");
			playAgain = input.nextLine().charAt(0);
			
		} while (playAgain != ('n' | 'N'));
	}

}


