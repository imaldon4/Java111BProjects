import java.util.Random;
/**
 * This subclass extends NumberGuesser superclass
 * @author Ike Maldonado
 * @version 11/13/18
 *
 */
public class RandomNumberGuesser extends NumberGuesser {

	private int range;
	
	/**
	 * Constructor sets upper and lower bounds and generates
	 * a random number in between the upper and lower bound.
	 * @param l Lower bound parameter
	 * @param u Upper bound parameter
	 */
	RandomNumberGuesser(int l, int u){
		super(l, u);
		range = (upperB - lowerB) + 1;
		super.currentGuess = rand();
	}
	
	/**
	 * Default constructor sets up superclass constructor, 
	 * then generates a random number between the default 
	 * bound.
	 */
	RandomNumberGuesser(){
		super();
		super.currentGuess = rand();
	}
	
	@Override
	public int getCurrentGuess() {
		return super.currentGuess;
	}
	
	public int rand() {
		int rand = (int)(Math.random()*range) + lowerB;
		return rand;
	}
}
