package shinkle_vtipper;
import java.util.Scanner;
import java.util.Date;

public class User_Interface {
//Tyler Shinkle ITDEV 110-002 Assignment #4
//** EXTRA CREDIT ATTEMPTED **

//initialize scanner object as keyboard
Scanner keyboard = new Scanner(System.in);
String userInput = " ", restName, totalWithoutTip, tipPercentage, billSplit;


    // Display introduction to user. 
    public void intro()
    {
        System.out.println("\t************************************************************************");
        System.out.println("\t* Applcation Name: VTipper                                             *");
        System.out.println("\t* Author: Tyler Shinkle                                                *");
        System.out.println("\t* Course: ITDEV 110-002                                                *");
        System.out.println("\t* NOTES: Extra credit attempted.                                       *");
        System.out.println("\t* Description: This application will prompt the user for input such as *");
        System.out.println("\t* the name of the restaurant, the bill total without tip, the desired  *");
        System.out.println("\t* tip percentage, the amount of people the bill is being split amongst *");
        System.out.println("\t* and whether the user would like to round the bill up to either a ten,*");
        System.out.println("\t* twenty, fifty or one hundred dollar bill. If at any point the user   *");
        System.out.println("\t* inputs the string 'quit' or any case variation the program will exit.*");
        System.out.println("\t*                                                                      *");
        System.out.println("\t* Once all of the data is gathered and confirmed a bill summary will   *");
        System.out.println("\t* be displayed showing the current date, name of the restaurant, total *");
        System.out.println("\t* of the bill without tip, tip percentage, tip amount, total of bill   *");
        System.out.println("\t* with tip included, amount due per person, and the values when the    *");
        System.out.println("\t* bill is rounded to the next increment of each bill type.             *");
        System.out.println("\t************************************************************************");
        System.out.println("\t(If at anytime you would like to exit type 'quit' and hit enter.)       ");
    }

        //gather information from user, count will be incremented and passed
        //as i to access these statements sequentially until 'quit' is returned. 
        public String getInfo(int i)
        {
            switch(i)
            {
                case 0:
                    System.out.print("\tEnter name of restaurant: ");
                    restName=keyboard.nextLine();
                    return restName;
                case 1:
                    System.out.print("\tEnter the bill total without tip: $");
                    totalWithoutTip=keyboard.nextLine();
                    return totalWithoutTip;
                case 2:
                    System.out.print("\tEnter a number 1-50 which will represent your tip percentage:");
                    tipPercentage=keyboard.nextLine();
                    return tipPercentage;
                case 3:
                    System.out.print("\tHow many people will this bill be divided amongst?:");
                    billSplit=keyboard.nextLine();
                    return billSplit;
                default:
                    return "quit";
            }
        }

        //ask user to continue or start another bill sequence. 
        public String continueOrClose()
        {
            System.out.print("\tPress enter to calculate another bill, type 'quit' to end this application:");
            userInput=keyboard.nextLine();
            return userInput;
        }

}
