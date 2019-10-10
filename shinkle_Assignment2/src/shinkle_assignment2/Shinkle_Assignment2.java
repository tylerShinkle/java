//Tyler Shinkle ITDEV 110 Assignment #2
package shinkle_assignment2;
import java.util.Date;

public class Shinkle_Assignment2 {

    public static void main(String[] args) {
        // Tyler Shinkle ITDEV 110 Assignment #2
        
        //Display date...
        Date date = new Date();
        System.out.println(date);
        
        //instantiate me with proper info...
        AboutMe me = new AboutMe("Tyler Shinkle","2","ITDEV 110","Intro to Object-Oriented Programming","Mr. Jones",date);
        
        //call the DisplayInfo() method on me
        me.DisplayInfo();
    }
    
}
