import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNumberGuesser rng = new RandomNumberGuesser(1, 10);
		//Should only run random once during the constructor phase of rng
		System.out.println(rng.getCurrentGuess());
		System.out.println(rng.getCurrentGuess());
		System.out.println(rng.getCurrentGuess());
		
		
	}
//    /**
//    This method will ask the user to play again, and return character
//    to the place that called it.
//    @param none
//    @return answer Returns the character entered by user.
//    */
//    public char reset(){
//        System.out.print("\n\nEnter y to play again or n to exit: ");
//        Scanner input = new Scanner(System.in); //Use scanner class to get input
//        String a = input.nextLine();
//        char answer = a.charAt(0);              //Get character from string
//        return answer;                          //Return character
//    }
	
//    /**
//    Start the program with this method. It's a loop that continues
//    if the user still declares that the number is higher or lower. 
//    @param none
//    */
//    public void start(){
//        char answer;        //Holds the user's response
//        //Loops current guesses
//        do {
//            System.out.print("Is it " + getCurrentGuess() + 
//            "? (h/l/c) ");
//
//            //highLowCorrect() method asks user for response and returns
//            //a character set to variable answer
//            answer = result();
//            //setValues() method sets the fields of upper and lower bounds
//            //depending on if user entered 'h' or 'l'
//            setValues(answer);
//
//            //While user responds higher, or lower, loop continues.
//        } while ((answer == 'h' || answer == 'l'));
//    }

//    /**
//    Calls scanner and returns value of inputed char.
//    @param none
//    @return answer.charAt(0) Returns the first character entered 
//    by the user.
//    */
//    public char result(){
//        //Create Scanner object, set a string to the output.
//        //Return character entered.
//        Scanner input = new Scanner(System.in);
//        String answer = input.nextLine();
//        return (answer.charAt(0));
//    }

}
