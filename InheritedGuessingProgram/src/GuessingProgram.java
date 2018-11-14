//
//public class GuessingProgram {
//    /**
//    This program will take in user bounds and guess number that the user is thinking of, and lastly will prompt user to play again or to exit. 
//    @author Ike Maldonado
//    @version 10/07/18
//    */
//    public static void main(String[] args) {
//        //Initialize variables.
//        int roof = 0;
//        int floor = 0;
//        char reset;
//        
//
//        //Do-while loop contains calling methods while running and exits
//        //loop if user doesn't want to play anymore.
//        do{ 
//            //Create a NumberGuesser object called 'numguess'.
//            NumberGuesser numguess = new NumberGuesser(floor, roof);
//
//            System.out.print("Let's play a game. \nPlease enter the upper bound");
//            //Set the upper bound using the .higher() method
//            numguess.higher();
// 
//            System.out.print("Please enter the lower bound");
//            //Set the lower boudn using the .lower() method
//            numguess.lower();
//
//            //Use toString method to directly call field values
//            System.out.println("\nGreat! " + numguess); 
//
//            //Ask user to think of a number between provided bounds.
//            System.out.print("Think of a number between " + numguess.getLower() +
//                " and " + numguess.getHigher() + ".\n");
//
//            //Use the .start() method to begin the process of guessing 'l' 'h' or 'c'
//            numguess.start();
//
//            //Use the .reset() method to ask user if wants to play again.
//            reset = numguess.reset();
//
//        //Exits loop if user does not want to play again.    
//        } while (reset == 'y' || reset == 'Y');
//        System.out.println("Thank you for playing. Bye!");
//    }
//}