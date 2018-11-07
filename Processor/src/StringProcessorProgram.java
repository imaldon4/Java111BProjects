import java.util.Scanner;

/**
 * Main method that calls the methods within the StringProcessor class.
 * @author Ike Maldonado
 * @version 11/06/18
 *
 */
public class StringProcessorProgram {
	public static void main(String[] args) {
		// Variables to hold input
		char tryAgain;
		String input;
		// Call StringProcessor class
		StringProcessor s = new StringProcessor();
		// For scanner object input
		Scanner keyboard = new Scanner(System.in);
		
		// Do while loop contains the program for user input and method calls
		do {
			System.out.println("Enter a line of text: ");
			input = keyboard.nextLine();
			// Sets the StringProcessor object to user string 
			s.setString(input);
			
			System.out.println("words: "+ s.wordCount());
			System.out.println("uppercase: " + s.uppercaseCount());			
			System.out.println("digits: " + s.digitCount());			
			System.out.println("digit words: " + s.digitWordCount());			
			System.out.println("line with whitespace removed: " + s.getNoSpaceString());	
			System.out.println("line with vowels replaced: " + s.getNoVowelString());
			System.out.println("line with digit words replaced: " + s.getNoDigitWordString());
			
			// Prompt to go again
			System.out.println("do you want to enter another? (Y/N): ");
			
			input = keyboard.nextLine();
			tryAgain = input.charAt(0);
		} while (Character.toUpperCase(tryAgain) == 'Y');
		
		System.out.print("Bye!");
		System.exit(0);
	}
	
}
