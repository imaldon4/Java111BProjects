import java.util.Scanner;

/**
This class represents the number guessing program. It contains
userful utilities for producing the number guessing program.
*/
public class NumberGuesser{
    //Fields to hold upper and lower bounds of guess.
    private int lowerB;
    private int upperB;
    private int currentGuess;


    /**
    Constructor to set values of fields.
    @param lowerBound Sets value of lowerB field.
    @param upperBound Sets value of upperB field.
    */
    public NumberGuesser(int lowerBound, int upperBound){
        lowerB = lowerBound;
        upperB = upperBound;
        currentGuess = getMidpoint(lowerB, upperB);
    }


    /**
    The toString method returns a concantenated upper and lower bound.
    @param none
    @return str Returns the concatenated string of upper and lower bounds.
    */
    public String toString(){
        String str = "The upper bound is set to " + upperB + "\nThe lower bound is set to " + lowerB + "\nLets get started...\n";
        //Returns the string of the upper and lower bounds
        return str;
    }


    /**
    This method is used to introduce the program.
    @param none
    */
    public void intro(){
        System.out.println("Welcome! This program will guess the number.");
    }


    /**
    Start the program with this method. It's a loop that continues
    if the user still declares that the number is higher or lower. 
    @param none
    */
    public void start(){
        char answer;        //Holds the user's response
        //Loops current guesses
        do {
            System.out.print("Is it " + getCurrentGuess() + 
            "? (h/l/c) ");

            //highLowCorrect() method asks user for response and returns
            //a character set to variable answer
            answer = result();
            //setValues() method sets the fields of upper and lower bounds
            //depending on if user entered 'h' or 'l'
            setValues(answer);

            //While user responds higher, or lower, loop continues.
        } while ((answer == 'h' || answer == 'l'));
    }

    
    /**
    Calls scanner and returns value of inputted char.
    @param none
    @return answer.charAt(0) Returns the first character entered 
    by the user.
    */
    public char result(){
        //Create Scanner object, set a string to the output.
        //Return character entered.
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        return (answer.charAt(0));
    }


    /**
    Sets the values of upper and lower bound depending on 
    whether the user entered higher or lower.
    @param answer Takes either 'h', 'l','c', or an illegal 
    character and sets the appropriate value of upper and lower bounds
    or returns an error message.
    */
    public void setValues(char answer) {
        int correct;        //Holds value if user entered 'c'

        //If user entered 'h' lower bound is set to midpoint value
        if (answer == 'h') {
            lowerB = getMidpoint(lowerB, upperB);

        //If user entered 'l' higher bound is set to midpoint value
        } else if (answer == 'l') {
            upperB = getMidpoint(lowerB, upperB);

        //If user entered 'c' gets the current guess value
        } else if (answer == 'c'){
            correct = getCurrentGuess();
            //Then prints result of number
            System.out.print("You were thinking of the number: " + correct);

        //If user entered an invalid character type
        } else {
            System.out.print(answer + " is an invalid answer");
        }
    }


    /**
    This method will ask the user to play again, and return character
    to the place that called it.
    @param none
    @return answer Returns the character entered by user.
    */
    public char reset(){
        System.out.print("\n\nEnter y to play again or n to exit: ");
        Scanner input = new Scanner(System.in); //Use scanner class to get input
        String a = input.nextLine();
        char answer = a.charAt(0);              //Get character from string
        return answer;                          //Return character
    }


    /**
    Returns the lower bound number.
    @param none
    @return lowerB The value of the lower bound.
    */
    public int getLower(){
        return lowerB;
    }


    /**
    Returns the upper bound number.
    @param none
    @return upperB The value of the upper bound.
    */
    public int getHigher(){
        return upperB;
    }


    /**
    Gets current guess, which is the midpoint.
    @param none
    @return mid Returns the midpoint value.
    */
    public int getCurrentGuess(){
        //Call the getMidpoint() method and calculate the values
        //by using the upperB and lowerB field values.
        int mid = getMidpoint(lowerB, upperB);
        return mid;
    }


    /**
     * The getMidpoint method calculates the midpoint of two integers and 
     * returns the midpoint value. 
     * @param low
     * @param high
     * @return mid Returns the midpoint value for two numbers entered.
     */
    public int getMidpoint(int low, int high){
        int mid = (low + high)/2;
        return mid;
    }

    /**
    Sets the values of the upper bound taking in user input.
    @param none
    */
    public void higher(){
        Scanner keyboard = new Scanner(System.in);
        int roof = keyboard.nextInt();
        upperB = roof;
    }


    /**
    Sets the values of the lower bound taking in user input.
    @param none
    */
    public void lower(){
        Scanner keyboard = new Scanner(System.in);
        int floor = keyboard.nextInt();
        lowerB = floor;
    }
}