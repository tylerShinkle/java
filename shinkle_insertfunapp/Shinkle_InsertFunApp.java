

package shinkle_insertfunapp;


public class Shinkle_InsertFunApp {
//Tyler Shinkle ITDEV 110-002 Assignment #6

//instantiate admin object of Admin class.
static Admin admin=new Admin();

//instantiate control object of GameController class.
static GameController control=new GameController();

//variable to control the exit process of our app.
public static int exitCode=0;

    public static void main(String[] args) {
        //Call the introduction method from the Admin class
        admin.intro();
 
        //run the controller until a non-zero integer is returned.
        while (exitCode==0)
        {
            exitCode=control.createPoem();
        }

        //Call the exit method from the Admin class
        admin.exit();
        
       
    }

}
