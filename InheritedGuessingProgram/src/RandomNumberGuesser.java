import java.util.Random;
/**
 * This subclass extends NumberGuesser superclass and can select
 * a random number between a set range.
 * @author Ike Maldonado
 * @version 11/13/18
 *
 */
public class RandomNumberGuesser extends NumberGuesser {

	//Range field
	private int range;
	
	/**
	 * Constructor sets upper and lower bounds and generates
	 * a random number in between the upper and lower bound.
	 * @param l Lower bound parameter
	 * @param u Upper bound parameter
	 */
	RandomNumberGuesser(int l, int u){
		super(l, u);
		range(lowerB, upperB);
		super.currentGuess = rand();
	}
	
	public void range(int l, int u) {
		range = (u + l) / 2;
	}


	/**
	 * Default constructor sets up superclass constructor, 
	 * then generates a random number between the default 
	 * bound if no upper or lower bound is provided.
	 */
	RandomNumberGuesser(){
		super();
		super.currentGuess = rand();
	}
	
	/**
	 * Overridden getCurrentGuess method returns simply
	 * the currentGuess field value from NumberGuesser superclass.
	 */
	@Override
	public int getCurrentGuess() {
		return currentGuess;
	}
	
	/**
	 * Returns a random number between specified lower and
	 * upper bound values.
	 * @return rand A random integer between specified range
	 */
	public int rand() {
		int rand = (int)(Math.random()*range) + lowerB;
		return rand;
	}
	
    /**
    Sets the values of upper and lower bound depending on 
    whether the user entered higher or lower.
    @param answer Takes either 'h', 'l','c', or an illegal 
    character and sets the appropriate value of upper and lower bounds
    or returns an error message.
    */
	@Override
    public void setValues(char answer) {
		
        //If user entered 'h' lower bound is set to midpoint value
        if (answer == 'h') {
        	lowerB = currentGuess;
            getMidpoint(lowerB, upperB);
            currentGuess = rand();
            
        //If user entered 'l' higher bound is set to midpoint value
        } else if (answer == 'l') {
        	upperB = currentGuess;
            getMidpoint(lowerB, upperB);
            currentGuess = rand();

        //If user entered 'c' gets the current guess value
        } else if (answer == 'c'){
            //Then prints result of number
            System.out.print("You were thinking of the number: " + getCurrentGuess());
            
        //If user entered an invalid character type
        } else {
            System.out.print(answer + " is an invalid answer.");
        }
    }
	
	@Override
	public void getMidpoint(int l, int u){
		range(l, u);
	}
}
