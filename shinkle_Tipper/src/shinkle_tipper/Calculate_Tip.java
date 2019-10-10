//Tyler Shinkle ITDEV 110-002 Assignment #3
package shinkle_tipper;
import java.util.Scanner;
import java.util.Date;

public class Calculate_Tip 
{
//variables on top...
//receive input through Scanner class...
Scanner keyboard = new Scanner(System.in);
//Store name of restaurant...
String restaurant;
//float for storing fractions of a whole dollar...
float billTotal, billTotalIncludeTip,tipAmount;
float tipPercent=0.15f;
Date date;
//end of variable declarations

    //methods begin here...

    //intro to app displayed
    public void displayInfo()
    {
        System.out.println("\t****************************************************");
        System.out.println("\t* Applicaton Name: Tipper App                      *");
        System.out.println("\t* Author: Tyler Shinkle                            *");
        System.out.println("\t* Course Number:ITDEV 110-002                      *");
        System.out.println("\t* Description: This application will prompt the    *");
        System.out.println("\t* user for a restaurant name and a bill total.     *");
        System.out.println("\t* Once the the input is received it will calculate *");
        System.out.println("\t* a 15% tip and display both the tip amount and    *");
        System.out.println("\t* grand total. Finally, a pseudo receipt will be   *");
        System.out.println("\t* displayed to the user with date and time among   *");
        System.out.println("\t* other relevant information.                      *");
        System.out.println("\t****************************************************");
        
    }

    // prompt user for input, store name of restaurant and display it. 
    public void getRestaurant()
    {
        System.out.print("\tPlease enter name of restaurant: ");
        restaurant=keyboard.nextLine();
        System.out.println("\tThanks for visiting "+restaurant+"!");
    }

    //prompt user for the total of their bill without tip and store it in billTotal.
    public void getPreTipTotal()
    {
        System.out.print("\tPlease enter your bill's total without tip: $");
        billTotal=keyboard.nextFloat();
        System.out.println("\tWe have your bill's total as $"+billTotal+" before tip. \n\tOne moment while a 15% tip is calculated.");
    }
    
    //Calculate tip amount and store it in the float tipAmount, display amount to user.
    public void TipCalc()
    {
        tipAmount=billTotal*tipPercent;
        System.out.println("\tYour tip would be $"+tipAmount+".");
    }

    // add tipAmount to billTotal for the grand total and store in billTotalInclueTip
    public void getBillTotalWithTip()
    {
       billTotalIncludeTip=billTotal+tipAmount;
       System.out.println("\tYour grand total would be $"+billTotalIncludeTip+".");
    }

    //Display bill summary with current date and time.(restaurant name, total with and without tip and and tip amount)
    public void billSummary()
    {
        date=new Date();
        System.out.println("\tOne moment, a summary of your bill is coming up...");
        pause(2000);
        System.out.println("\t****************************************************");
        System.out.println("\tBILL SUMMARY");
        System.out.println("\tDate: "+date+".");
        System.out.println("\tRestaurant: "+restaurant);
        System.out.println("\tTotal: $"+billTotal);
        System.out.println("\tRate of tip: 15%");
        System.out.println("\tTip amount: "+tipAmount);
        System.out.println("\tGrand Total (tip included): "+billTotalIncludeTip);
        System.out.println("\t****************************************************");
        System.out.println("\tThank you! Have a nice day!");
        System.out.println("\t****************************************************");
    }
   
    //pause to enable focus and help reading comprehension
    public void pause(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }catch(InterruptedException e){
            System.out.println("interrupted");
        }
        

    }
 }
