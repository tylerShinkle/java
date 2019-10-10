package shinkle_vtipper;
import java.util.Date;
import java.text.DecimalFormat;
import java.lang.Math;

public class Calculate_Tip {
//Tyler Shinkle ITDEV 110-002 Assignment #4
//** EXTRA CREDIT ATTEMPTED **
String name;
double total, calcPercent, displayPercent, tipAmount, grandTotal, perPerson;
double fives, tens, twenties, fifties, hundreds, fivesAmount, tensAmount,twentiesAmount, fiftiesAmount, hundredsAmount;
double fivesTotal, tensTotal, twentiesTotal, fiftiesTotal, hundredsTotal, placeHolder;
double fivesPer, tensPer, twentiesPer, fiftiesPer, hundredsPer;
int splitBy;
Date date = new Date();
String perPersonNote="\tNOTE: Amount due per person may result in overpaying depending\n\tupon how the total divides among the people splitting the bill.";
String fiveMsg, tenMsg, twentyMsg, fiftyMsg, hundredMsg;
DecimalFormat dec = new DecimalFormat("0.00");
DecimalFormat perc = new DecimalFormat("0.#");

    
    //constructor to build the bill as a Calculate_Tip object.
    public Calculate_Tip(String name, String total, String percentage, String splitBy)
    {
        this.name=name;
        this.total=Double.parseDouble(total);
        this.displayPercent=Double.parseDouble(percentage);
        this.calcPercent=Double.parseDouble(percentage)*.01d;
        this.splitBy=Integer.parseInt(splitBy);
    }
    
    //generate values for tip amount,grand total and cost per person.
    public void tipCalc()
    {
        tipAmount = total*calcPercent;
        grandTotal = total+tipAmount;
        perPerson = grandTotal / splitBy;
        //make sure the amount due per person multiplied by the number of 
        //people is equal to or greater than the grand total, otherwise
        //add 1 cent per person until it is.
        while(Double.parseDouble(dec.format(perPerson))*splitBy<Double.parseDouble(dec.format(grandTotal)))
        {
            perPerson+=.01;
        }
    }

    //generate bills rounded to next bill for 5, 10, 20, 50 and 100 dollar bills.
    public void round(int bill)
    {
        //message outlines...
        String roundTotalMsg="\tThe total before tip while rounding to the next "+bill+" dollar bill: $";
        String roundTipMsg="\tThe tip amount when rounding up to the next "+bill+" dollar bill: $";
        String roundGrandMsg="\tThe grand total when rounding up to the next "+bill+" dollar bill: $";
        String roundPerMsg="\tThe amount due per person when rounding up to the next "+bill+" dollar bill: $";
        //calculate rounded values.
        placeHolder=(total/bill);
        placeHolder=Math.floor(placeHolder);
        placeHolder+=1;
        placeHolder*=bill;

        //pass the place holder value to the proper 
        //variable dependant on value of bill variable.
        //calculate values based on rounded totals. 
        switch (bill)
        {
            case 5:
                fives=placeHolder;
                fivesAmount=fives*calcPercent;
                fivesTotal=fives+fivesAmount;
                fivesPer=fivesTotal/splitBy;
                //prioritize overpaying opposed to underpaying when rounding
                while(Double.parseDouble(dec.format(fivesPer))*splitBy<Double.parseDouble(dec.format(fivesTotal)))
                {
                    //TEST
                    System.out.println("!!!!!"+Double.parseDouble(dec.format(fivesPer))*splitBy+dec.format(fivesTotal));
                    fivesPer+=.01;
                }
                fiveMsg=roundTotalMsg+dec.format(fives)+"\n"+roundTipMsg+dec.format(fivesAmount)+"\n"+roundGrandMsg+dec.format(fivesTotal)+"\n"+roundPerMsg+dec.format(fivesPer);
                break;
            case 10:
                tens=placeHolder;
                tensAmount=tens*calcPercent;
                tensTotal=tens+tensAmount;
                tensPer=tensTotal/splitBy;
                while(Double.parseDouble(dec.format(tensPer))*splitBy<Double.parseDouble(dec.format(tensTotal)))
                {
                    tensPer+=.01;
                }
                tenMsg=roundTotalMsg+dec.format(tens)+"\n"+roundTipMsg+dec.format(tensAmount)+"\n"+roundGrandMsg+dec.format(tensTotal)+"\n"+roundPerMsg+dec.format(tensPer);
                break;
            case 20:
                twenties=placeHolder;
                twentiesAmount=twenties*calcPercent;
                twentiesTotal=twenties+twentiesAmount;
                twentiesPer=twentiesTotal/splitBy;
                while(Double.parseDouble(dec.format(twentiesPer))*splitBy<twentiesTotal)
                {
                    twentiesPer+=.01;
                }
                twentyMsg=roundTotalMsg+dec.format(twenties)+"\n"+roundTipMsg+dec.format(twentiesAmount)+"\n"+roundGrandMsg+dec.format(twentiesTotal)+"\n"+roundPerMsg+dec.format(twentiesPer);
                break;
            case 50:
                fifties=placeHolder;
                fiftiesAmount=fifties*calcPercent;
                fiftiesTotal=fifties+fiftiesAmount;
                fiftiesPer=fiftiesTotal/splitBy;
                while(Double.parseDouble(dec.format(fiftiesPer))*splitBy<fiftiesTotal)
                {
                    fiftiesPer+=.01;
                }
                fiftyMsg=roundTotalMsg+dec.format(fifties)+"\n"+roundTipMsg+dec.format(fiftiesAmount)+"\n"+roundGrandMsg+dec.format(fiftiesTotal)+"\n"+roundPerMsg+dec.format(fiftiesPer);
                break;
            case 100:
                hundreds=placeHolder;
                hundredsAmount=hundreds*calcPercent;
                hundredsTotal=hundreds+hundredsAmount;
                hundredsPer=hundredsTotal/splitBy;
                while(Double.parseDouble(dec.format(hundredsPer))*splitBy<hundredsTotal)
                {
                    hundredsPer+=.01;
                }
                hundredMsg=roundTotalMsg+dec.format(hundreds)+"\n"+roundTipMsg+dec.format(hundredsAmount)+"\n"+roundGrandMsg+dec.format(hundredsTotal)+"\n"+roundPerMsg+dec.format(hundredsPer);
                break;
            default:
                break;
        }
    }
    
    //display bill summary plus rounded suggestions.
    public void totalBill()
    {
        System.out.println("\tBILL SUMMARY");
        System.out.println("\t*************************************************************************");
        System.out.println("\tDate: "+date);
        System.out.println("\tRestaurant Name: "+name);
        System.out.println("\tTotal before tip: $"+dec.format(total));
        System.out.println("\tTip percentage: "+perc.format(displayPercent)+"%");
        System.out.println("\tTip Amount: $"+dec.format(tipAmount));
        System.out.println("\tGrand Total: $"+dec.format(grandTotal));
        System.out.println("\tBeing split amongst: "+splitBy);
        System.out.println("\tAmount due per person: $"+dec.format(perPerson));
        System.out.println("\t*************************************************************************");
        System.out.println(perPersonNote);
        System.out.println("\t*************************************************************************");
        pause(1000);
        System.out.println("\tCalculating rounded suggestions...");
        pause(2000);
        System.out.println("\tROUNDING SUGGESTIONS");
        System.out.println("\t**************************************************************************");
        pause(1000);
        System.out.println("\t*ROUND TO NEXT $5*");
        System.out.println(fiveMsg);
        pause(1000);
        System.out.println("\t*ROUND TO NEXT $10*");
        System.out.println(tenMsg);
        pause(1000);
        System.out.println("\t*ROUND TO NEXT $20*");
        System.out.println(twentyMsg);
        pause(1000);
        System.out.println("\t*ROUND TO NEXT $50*");
        System.out.println(fiftyMsg);
        pause(1000);
        System.out.println("\t*ROUND TO NEXT $100");
        System.out.println(hundredMsg);
    }

    //pause to aid in reading comprehension and pacing;
    public void pause(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }catch(InterruptedException e)
            {
                System.out.println("Interrupted");
            }
    }

}
