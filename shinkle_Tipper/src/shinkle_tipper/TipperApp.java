package shinkle_tipper;

public class TipperApp {
//Tyler Shinkle Assignment ITDEV 110-002 Assignment #3

    public static void main(String[] args) {
        //create object of Calculate_Tip class
        Calculate_Tip buildBill = new Calculate_Tip();
        //display intro
        buildBill.displayInfo();
        //pause for reading
        buildBill.pause(1000);
        //get restaurant name
        buildBill.getRestaurant();
        //pause for reading
        buildBill.pause(1000);
        /*prompt user for bill total before tip 
          and display the bill total.*/
        buildBill.getPreTipTotal();
        //pause for reading
        buildBill.pause(1000);
        /*Calculate the tip amount at 15%
          and display said amount.*/
        buildBill.TipCalc();
        //pause for reading 
        buildBill.pause(1000);
        /*Calculate total of bill plus tip
          and display the grand total*/
        buildBill.getBillTotalWithTip();
        //pause for reading
        buildBill.pause(1000);
        //print out a formatted bill summary with requisite fields
        buildBill.billSummary();
    }

}
