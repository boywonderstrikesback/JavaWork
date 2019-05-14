package guesslogic;

import java.util.Scanner;
import java.util.Random;



/**
 *
 * @author mikeross
 */
public class GuessLogic {
private static int guess=0 ;      // State variables shared by all methods.
private int random;
private int range;
 Scanner scan = new Scanner(System.in);
 private int tries;

 
 private float TooLow;
 private float Correct;
 
 public GuessLogic(int range){
    this.range = range;
     generateRandomNumber();
}

private void generateRandomNumber() {
        Random rand = new Random();
        this.random = rand.nextInt(range) + 1;
    }
    // The default contructor sets the intial values of the state variables to 0.
   
    public GuessLogic(int userguess, int computerinput) {
        
    }

    
    // These two "getter" methods return the values of state variables
    public int getGuess() {
        
        return guess;
    }

    public int getrandom() {
        return random;
    }

    // These "setter" methods set state variable values to the parameters.
    public void setguess(int userguess) {
       guess = userguess;
    }

    public void setrandom(int computerinput) {
       random  = computerinput;
    }

    // A "convenience" method to allow the user to set both at once.
    public void setTime(int userguess, int computerinput) {
        setguess(userguess);
        setrandom(computerinput);
    }

    // A complex method to increment the minute (and hour if necessary)
   public void logic(int guess, int random){
        while (guess<random){
            guess+=TooLow;
        }
         if (guess==random){   
           guess+=Correct;
       
         }
   }

    
    
    
    
    
    
    // This returns the time in a common hour:minute format
   // public String toString() {
       // String result = "";
        //if (tries < 7) result += "0" + hour;
        //else result += hour;
       // result += ":";
        //if (minute < 10) result += "0" + minute;
        //else result += minute;
        //return result;
    //}

}








    



   
    
    
  