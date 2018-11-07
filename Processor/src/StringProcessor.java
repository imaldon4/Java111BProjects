/**
 * This class can help process strings to remove or add attributes.
 * @author Ike Maldonado
 * @version 10/19/18
 *
 */
public class StringProcessor {
	
	//Field
	private StringBuilder str;

	/**
	 * No arg and default constructors
	 */
	public StringProcessor() {
		str = new StringBuilder();
	}
	public StringProcessor(String s) {	
		str = new StringBuilder(s);
	}	
	
	/**
	 * Sets the StringBulder object 
	 * @param s The StringBuilder object
	 */
	void setString(String s) {	
		str = new StringBuilder(s);
	}
	
	/**
	 * Returns a StringBuilder object as a string
	 * @return string The converted string object.
	 */
	String getString() {
		return str.toString();
	}
	
	/**
	 * Returns the number of words in a string
	 * @return 
	 */
	int wordCount() {
		// Convert to String, trim white spaces, split, then count words.
		return str.toString().trim().split(" ").length;
	}
	
	/**
	 * Returns the number of letters in upper case
	 * @return uppercase Total letters in uppercase
	 */
	int uppercaseCount() {	
		int uppercase = 0; // Counter variable
		String s = str.toString(); // Initialize a new StringBuilder object
		char[] array = s.toCharArray(); // Create an array of each character
		// Use for loop to iterate through each character and compare for
		// upper case, add +1 to counter.
		for (int i = 0; i < array.length; i++) {
			if (Character.isUpperCase(array[i])) {
				uppercase++;
			}
		}
		return uppercase;
	}
	
	/**
	 * Returns the number of numerical digits in a string.
	 * @return numbers The number of digits in string
	 */
	int digitCount() {	
		int numbers = 0; // Counter variable
		char[] array = str.toString().toCharArray(); // Set into array
		
		// Use for loop to iterate through all digit characters
		// and increment counter by +1.
		for (int i = 0; i < array.length; i++) {
			if (Character.isDigit(array[i])){
				numbers++;
			} 
		}
		return numbers;
	}
	
	/**
	 * Returns the number of digit words in a string.
	 * @return digitwords The number of digit words
	 */
	int digitWordCount() {
		int digitwords = 0; // Initialize counter
		// Use a delimiter to split the string into an array
		String[] tokens = str.toString().trim().split(" ");
		// Iterate through array for each word digit, then increment
		// counter by +1.
		for(int i = 0; i < tokens.length; i++) {
			if (tokens[i].equalsIgnoreCase("one")) {
				digitwords++;
			} else if (tokens[i].equalsIgnoreCase("two")) {
				digitwords++;
			} else if (tokens[i].equalsIgnoreCase("three")) {
				digitwords++;
			} else if (tokens[i].equalsIgnoreCase("four")) {
				digitwords++;
			} else if (tokens[i].equalsIgnoreCase("five")) {
				digitwords++;
			} else if (tokens[i].equalsIgnoreCase("six")) {
				digitwords++;
			} else if (tokens[i].equalsIgnoreCase("seven")) {
				digitwords++;
			} else if (tokens[i].equalsIgnoreCase("eight")) {
				digitwords++;
			} else if (tokens[i].equalsIgnoreCase("nine")) {
				digitwords++;
			} else {
				//nothing needs to happen here
			}
		}
		return digitwords;
	}
	
	/**
	 * Returns string with whitespace removed.
	 * @return
	 */
	String getNoSpaceString() {	
		// Create a new StringBuilder object
		StringBuilder obj = new StringBuilder(str);
		// Search the index for all whitespace characters
		int index = obj.toString().indexOf(" ");
		// Loop through all white space characters, replacing with "".
		while (index != -1) {
			obj.replace(index, index + 1, "");
			// Set the index to one space after white space
			index = obj.toString().indexOf(" ", index);
		}
		// Return the finalized String
		return obj.toString();
	}
	
	/**
	 * Returns a string that replaces all vowels with a '-' dash. 
	 * @return
	 */
	String getNoVowelString() {	
		// Create a StringBuilder object.
		String s = new String(str);
		// For all upper and lowercase vowels, replace with a dash.
		return s.toString().replace('a', 
				'-').toString().replace('A', 
				'-').toString().replace('e',
				'-').toString().replace('E', 
				'-').toString().replace('i', 
				'-').toString().replace('I', 
				'-').toString().replace('o', 
				'-').toString().replace('O', 
				'-').toString().replace('u', 
				'-').toString().replace('U', 
				'-');
	}
	
	/**
	 * Return string with all word numbers converted to numeric digits.
	 * @return
	 */
	String getNoDigitWordString() {	
		int index; // To hold position of number in string
		// Check upper and lower case, and get index of numbers.
		// Make sure that length of indices matches length of number.
		// Utilize while loop to iterate through all matching word values.
		// Replace with the corresponding numerical digit.
		index = str.toString().toLowerCase().indexOf("one");
		while (index != -1) {
			str.replace(index, index + 3, "1");
			index = str.toString().toLowerCase().indexOf("one", index);
		}
		index = str.toString().toLowerCase().indexOf("two");
		while (index != -1) {
			str.replace(index, index + 3, "2");
			index = str.toString().toLowerCase().indexOf("two", index);
		}
		index = str.toString().toLowerCase().indexOf("three");
		while (index != -1) {
			str.replace(index, index + 5, "3");
			index = str.toString().toLowerCase().indexOf("three", index);
		}
		index = str.toString().toLowerCase().indexOf("four");
		while (index != -1) {
			str.replace(index, index + 4, "4");
			index = str.toString().toLowerCase().indexOf("four", index);
		}
		index = str.toString().toLowerCase().indexOf("five");
		while (index != -1) {
			str.replace(index, index + 4, "5");
			index = str.toString().toLowerCase().indexOf("five", index);
		}
		index = str.toString().toLowerCase().indexOf("six");
		while (index != -1) {
			str.replace(index, index + 3, "6");
			index = str.toString().toLowerCase().indexOf("six", index);
		}
		index = str.toString().toLowerCase().indexOf("seven");
		while (index != -1) {
			str.replace(index, index + 5, "7");
			index = str.toString().toLowerCase().indexOf("seven", index);
		}
		index = str.toString().toLowerCase().indexOf("eight");
		while (index != -1) {
			str.replace(index, index + 5, "8");
			index = str.toString().toLowerCase().indexOf("eight", index);
		}
		index = str.toString().toLowerCase().indexOf("nine");
		while (index != -1) {
			str.replace(index, index + 4, "9");
			index = str.toString().toLowerCase().indexOf("nine", index);
		}
		
		// Return modified String.
		return str.toString();
	}
}
