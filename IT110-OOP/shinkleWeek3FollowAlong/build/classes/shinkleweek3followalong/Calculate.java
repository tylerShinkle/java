package shinkleweek3followalong;

//Scanner class!!
//Imports under package is the standard.
import java.util.Scanner;

public class Calculate {
    
    int a,b;
    Scanner keyboard = new Scanner(System.in);
    
    public void integerCalc(){
        a=3+3;
        System.out.println("Value for a : "+a);
        
        System.out.print("Enter a number between 1 and 10: ");
        b=keyboard.nextInt();
        if(b>0 && b<10){
            System.out.println("Here is your number: "+b);
        }
        else{
            System.out.println("Sorry your number is not between 1 and 10.");
        }
    }
}
