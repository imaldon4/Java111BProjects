import java.util.Scanner;
/**
 * This class contains utilities to obtain the midpoint between
 * two numbers.
 * @author Ike Maldonado
 * @version 11/13/18
 *
 */
public class NumberGuesser{
    //Fields to hold upper and lower bounds of guess.
    protected int lowerB;
    protected int upperB;
    protected int currentGuess;

    /**
     * A default constructor.
     */
    public NumberGuesser() {
    	lowerB = 1;
    	upperB = 100;
    }

    /**
    Constructor to set values of fields.
    @param lowerBound Sets value of lowerB field.
    @param upperBound Sets value of upperB field.
    */
    public NumberGuesser(int lowerBound, int upperBound){
        lowerB = lowerBound;
        upperB = upperBound;
    }


    /**
    @return str Returns the concatenated string of upper and lower bounds.
    */
    public String toString(){
        String str = "(Upper Bound: " + upperB + ", Lower Bound: " + lowerB;
        return str;
    }
    

//    /**
//    Sets the values of upper and lower bound depending on 
//    whether the user entered higher or lower.
//    @param answer Takes either 'h', 'l','c', or an illegal 
//    character and sets the appropriate value of upper and lower bounds
//    or returns an error message.
//    */
//    public void setValues(char answer) {
//        int correct;        //Holds value if user entered 'c'
//
//        //If user entered 'h' lower bound is set to midpoint value
//        if (answer == 'h') {
//            lowerB = getMidpoint(lowerB, upperB);
//
//        //If user entered 'l' higher bound is set to midpoint value
//        } else if (answer == 'l') {
//            upperB = getMidpoint(lowerB, upperB);
//
//        //If user entered 'c' gets the current guess value
//        } else if (answer == 'c'){
//            correct = getCurrentGuess();
//            //Then prints result of number
//            System.out.print("You were thinking of the number: " + correct);
//
//        //If user entered an invalid character type
//        } else {
//            System.out.print(answer + " is an invalid answer");
//        }
//    }


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
    @return mid Returns the current value.
    */
    public int getCurrentGuess(){
        return currentGuess;
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
    Sets the values of the upper bound.
    @param u An integer value
    */
    public void setUpperB(int u){
        upperB = u;
    }


    /**
    Sets the values of the lower bound.
    @param l An integer value
    */
    public void setLowerB(int l){
        lowerB = l;
    }
}