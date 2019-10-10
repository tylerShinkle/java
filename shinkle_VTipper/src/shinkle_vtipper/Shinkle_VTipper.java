package shinkle_vtipper;

public class Shinkle_VTipper {
// Tyler Shinklle ITDEV 110-002 Assignment #4
//** EXTRA CREDIT ATTEMPTED **
static boolean running=true;
static int count=0;
static String userInput, exitCode="quit";

    public static void main(String[] args) 
    {

        //construct user interface object.
        User_Interface UI = new User_Interface();
        
        //display intro
        UI.intro();     

        //run app until "quit" is passed to userInput
        while(running)
        {
            //if count = 5 prompt the user to continue or close.
            //reset count to 0 to start over.
            if(count==5)
            {
                userInput=UI.continueOrClose();
            }
            
            //if count = 4 calculate and display the bill summary.
            //then display the calculations for rounding up to 
            //specified dollar bill increments.
            if(count==4)
            {
                Calculate_Tip bill = new Calculate_Tip(UI.restName,UI.totalWithoutTip,UI.tipPercentage,UI.billSplit);
                bill.tipCalc();
                bill.round(5);
                bill.round(10);
                bill.round(20);
                bill.round(50);
                bill.round(100);
                bill.totalBill();
            }
           
            //if count is less than 4 pass count to UI.getInfo
            //to gather the necessary information.
            if(count<4)
            {
                userInput=UI.getInfo(count);
            }

            // if userInput ever equals 'quit' (the exitCode) exit loop. 
            if (userInput.toLowerCase().equals(exitCode))
            {
                running=false;
            }
            
            //if the program is still running and the count is 5 set it 
            // to -1 so the incrementation will restart count at  0.
            if (count==5)
            {
                count=-1;
            }
            //increment count to move on to next step
            count++;
        }   
    }

}
