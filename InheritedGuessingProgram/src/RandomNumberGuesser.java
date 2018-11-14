
/**
 * This subclass extends NumberGuesser superclass and can select
 * a random number between a set range.
 * @author Ike Maldonado
 * @version 11/13/18
 *
 */
public class RandomNumberGuesser extends NumberGuesser {
	
	/**
	 * Constructor sets upper and lower bounds and generates
	 * a random number in between the upper and lower bound.
	 * @param l Lower bound parameter
	 * @param u Upper bound parameter
	 */
	RandomNumberGuesser(int l, int u){
		super(l, u);
	}


	/**
	 * Default constructor sets up superclass constructor, 
	 * then generates a random number between the default 
	 * bound if no upper or lower bound is provided.
	 */
	RandomNumberGuesser(){
		super();
	}
	
	/**
	 * Overridden getCurrentGuess method calls rand() method 
	 * to calculate currentGuess field.
	 * @return currentGuess The current guess field
	 */
	@Override
	public int getCurrentGuess() {
		rand();
		return currentGuess;
	}
	
	/**
	 * Returns a random number between specified lower and
	 * upper bound values.
	 */
	public void rand() {
		int range = (getHigher()-getLower());
		//Create a floor and calculate random number from floor to upper bound
		int n = (int) Math.floor(Math.random()*(range)) + getLower();
		currentGuess = n;
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
        	setLowerB(currentGuess);
        //If user entered 'l' higher bound is set to midpoint value
        } else if (answer == 'l') {
        	setUpperB(currentGuess);

        //If user entered 'c' gets the current guess value
        } else if (answer == 'c'){
            //Then prints result of number
            System.out.print("You were thinking of the number: " + currentGuess);
            
        //If user entered an invalid character type
        } else {
            System.out.print(answer + " is an invalid answer.");
        }
    }
}
