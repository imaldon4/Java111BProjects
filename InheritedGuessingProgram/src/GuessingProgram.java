import java.util.ArrayList;

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







//	public void stats() {
//		
//		ArrayList<Integer> a = array();
//		int zero = 0;
//		int one = 0;
//		int two = 0;
//		int three = 0;
//		int four = 0;
//		int five = 0;
//		int six = 0;
//		int seven = 0;
//		int eight = 0;
//		int nine = 0;
//		int ten = 0;
//		int eleven = 0;
//		
//		for(int i = 0; i < a.size(); i++) {
//			if (a.get(i) == 1) {
//				one++;
//			} else if (a.get(i) == 2) {
//				two++;
//			} else if (a.get(i) == 3) {
//				three++;
//			} else if (a.get(i) == 4) {
//				four++;
//			} else if (a.get(i) == 5) {
//				five++;
//			} else if (a.get(i) == 6) {
//				six++;
//			} else if (a.get(i) == 7) {
//				seven++;
//			} else if (a.get(i) == 8) {
//				eight++;
//			} else if (a.get(i) == 9) {
//				nine++;
//			} else if (a.get(i) == 10) {
//				ten++;
//			} else if (a.get(i) == 0) {
//				zero++;
//			} else {
//				eleven++;
//			}
//		}
//
////		System.out.println((double)(a.size()));
////		System.out.println((double)(one)/a.size());
//		System.out.println("One is: " + ((double)(one)*100/a.size()) + "%");
//		System.out.println("Two is: " + ((double)(two)*100/a.size()) + "%");
//		System.out.println("Three is: " + ((double)(three)*100/a.size()) + "%");
//		System.out.println("Four is: " + ((double)(four)*100/a.size()) + "%");
//		System.out.println("Five is: " + ((double)(five)*100/a.size()) + "%");
//		System.out.println("Six is: " + ((double)(six)*100/a.size()) + "%");
//		System.out.println("Seven is: " + ((double)(seven)*100/a.size()) + "%");
//		System.out.println("Eight is: " + ((double)(eight)*100/a.size()) + "%");
//		System.out.println("Nine is: " + ((double)(nine)*100/a.size()) + "%");
//		System.out.println("Ten is: " + ((double)(ten)*100/a.size()) + "%");
//		System.out.println("Eleven is: " + ((double)(eleven)*100/a.size()) + "%");
//		System.out.println("Zero is: " + ((double)(zero)*100/a.size()) + "%");
//		
//		System.out.println("Total percent: " + (one+two+three+four+five+six+seven+eight+nine+ten+eleven+zero));
//	}
//}


//public ArrayList<Integer> array() {
//	ArrayList<Integer> a = new ArrayList<>();
//	for (int i = 0; i < 1000000; i++) {
//		a.add(i, rand());
//	}
//	return a;
//}