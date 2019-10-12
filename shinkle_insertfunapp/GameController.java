
package shinkle_insertfunapp;

public class GameController {
//Tyler Shinkle ITDEV 110-002 Assignment #6

//String for temporary storage of user input
public String userInput;
//String array to hold word types to prompt user for.
public String[] promptArr = new String[]{"animal","body part","color","food","verb","animal","verb"};
//String array to hold the users responses to the prompts.
public String[] responseArr=new String[7];
//String to compare userInput against to control application state.
public String quitApp = "q";
    
    //method to gather and check user input.
    public int createPoem()
    {
        //Create user interface object.
        InsertFunUI_View ui = new InsertFunUI_View();

        //For each element of the prompt array (promptArr) prompt the user for
        //input of the specified word type,then pass that value to userInput.
        //If userInput ever equals 'q' return 1 to exit the progrma, otherwise
        //pass the value of userInput to the response array (responseArr).
        for (int i=0;i<promptArr.length;i++)
        {   
        //set userInput to users response to the prompt.
        //passing in the index of the prompt array matching i.
        userInput=ui.inScreen(promptArr[i]);
            //if userInput ever equals "q" or "Q" quit the program.
            if(userInput.toLowerCase().equals(quitApp))
            {
                return 1;
            }
            //if userInput is not "q" or "Q" set the index of responseArr[i]
            //to the value of userInput.
            responseArr[i]=userInput;
        }
        //end for

        //Set userInput to the return value of the ui.poem method 
        //Here we are passing the current object to the ui.poem method.
        //This call constructs and displays the poem.
        userInput=ui.poem(this);
            //if ui.poem returns 'q' return 1, otherwise return 0.
            if(userInput.toLowerCase().equals(quitApp))
            {
                return 1;
            }
        return 0;
    }

}
