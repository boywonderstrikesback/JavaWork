
package guesslogic;

import java.util.Random;

public class GuessList {
public static void main(String[] args) {
        
        // Prompt the user for an hour and minute, and use them to construct
        // a new clock object
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the hour to start at (in military 0-23 form): ");
        int hour = s.nextInt();
        System.out.print("Enter the minute to start at (0-59): ");
        int minute = s.nextInt();
        System.out.print("Enter the number of minutes to run: ");
        int time = s.nextInt();
        
        Guess guess = new Guess(hour, minute);
        
        // Call the nextMinute to update the minute, and the toString to print it.
        for (int m = 0; m < time; m++) {
            c.nextMinute();
            System.out.println(c.toString());
        }
    }
    
}



    

    

}
  
 
   
   

    
 
  







    



     




