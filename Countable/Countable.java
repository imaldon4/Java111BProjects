import java.util.Scanner;

/**
 * This class will go over the way to create classes and use them during method calls etc.
 * @author Ike Maldonado
 * @since 09/25/18
 */
public class Countable {
	private static int instanceCount = 0;
	
	/**
	 * The constructor increments the static field instanceCount.
	 * This keeps track of the number of instances of this class
	 * that are created.
	 */
	
	//Shouldn't the below be labeled void?
	public Countable() {
		instanceCount++;		
	}
	
	/**
	 * The getInstanceCount method returns the number of instances 
	 * of this class that has been created. 
	 * @return The value in the instanceCount field.
	 */
	
	public int getInstanceCount() {
		return instanceCount;
	}

}

