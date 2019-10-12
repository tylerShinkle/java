
package shinkle_insertfunapp;
import java.util.Scanner;


public class InsertFunUI_View {
//Tyler Shinkle ITDEV 110-002 Assignment #6
Scanner keyboard = new Scanner(System.in);
String userInput;
public String stars=" *****************************************************************************************";

    //method to prompt users for word types and return a String.
    public String inScreen(String type)
    {
        System.out.print(" Enter a word of this type->("+type.toUpperCase()+") or enter 'q' to quit:");
        userInput=keyboard.nextLine();
        return userInput;
    }

    //method to construct poem from object properties, 
    public String poem(GameController o)
    {
        System.out.println(stars);
        System.out.println(" *YOUR POEM*");
        System.out.println(" Mary had a little "+o.responseArr[0]+",");
        System.out.println(" Its "+o.responseArr[1]+" was "+o.responseArr[2]+" as "+o.responseArr[3]+",");
        System.out.println(" Everywhere that Mary "+o.responseArr[4]+";");
        System.out.println(" the "+o.responseArr[5]+" was sure to "+o.responseArr[6]+".");
        System.out.println(stars);
        System.out.print(" If you would like to create another poem hit 'Enter' otherwise enter 'q' to quit:");
        userInput=keyboard.nextLine();
        return userInput;
    }

    //method to format ouput to specified length and append a * at the end.
    public String padRight(String s)
    {
        return String.format("%-"+(stars.length()-1)+"s"," * "+s)+"*";
    }
}
