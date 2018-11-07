/**
 * Is this a test method for what?
 * @author imald
 *
 */
public class testMethod {

    public static int[] gradingStudents(int[] grades) {
    	int[] fixed = new int[grades.length];    	

    	for (int i = 0; i < grades.length; i++) {
    		if (grades[i] > 37) {
    			if (grades[i]%5 >2) {
    				fixed[i] = (grades[i] + (5-(grades[i]%5)));
    			} else {
    				fixed[i] = grades[i];
    			}
    		} else {
    			fixed[i] = grades[i];
    		} 	
    	}
    	return fixed;
    }
}
