//package delcaration
package shinkle_practiceobjects;

//class declaration
public class Admin {
//Tyler Shinkle ITDEV 110-002 Assignment #5
    
    //declare a string to format the border and set length of lines for all output.
    public static String stars="*********************************************************************";

    // intro method to introduce application. ( series of println statements )
    public void intro()
    {
        System.out.println("\t"+stars);
        System.out.println(padRight("\t* Application Name: Practice Objects"));
        System.out.println(padRight("\t* Author Name: Tyler Shinkle"));
        System.out.println(padRight("\t* Course: ITDEV 110-002"));
        System.out.println(padRight("\t* Assignment Number: 5"));
        System.out.println("\t"+stars);
        System.out.println(padRight("\t* Application Description: This application performs"));
        System.out.println(padRight("\t* arithmetic operations on pairs of numbers such as"));
        System.out.println(padRight("\t* multiplication and addition. These numbers are private"));
        System.out.println(padRight("\t* variables and this application is intended to practice"));
        System.out.println(padRight("\t* object instantiation and accesssing private variables"));
        System.out.println(padRight("\t* with getters and setters."));
        System.out.println("\t"+stars);
        System.out.println(padRight("\t* User Instructions: This application currently does not"));
        System.out.println(padRight("\t* interact with users, just sit back and read the output."));
        System.out.println("\t"+stars);
    }

    //Output a message to the user saying goodbye.
    public void goodbye()
    {
        System.out.println("\t"+stars);
        System.out.println(padRight("\t* Goodbye, we'll learn more next time!"));   
        System.out.println("\t"+stars);
    }
    
    // a method to make sure all output ends in a * and is at most the same length
    // as the stars string.(It pads strings with spaces and appends a * at the end)
    public static String padRight(String s)
    {
        return String.format("%-"+stars.length()+"s",s)+"*";
    }

}
