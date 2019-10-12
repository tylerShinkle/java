
package shinkle_insertfunapp;

public class Admin {
//Tyler Shinkle ITDEV 110-002 Assignment #6

  
    //create ui object from InsertFunUI_View class
    InsertFunUI_View ui = new InsertFunUI_View();
    
    //Display intro.
    public void intro()
    {
        System.out.println(ui.stars);
        System.out.println(ui.padRight("METADATA"));
        System.out.println(ui.padRight("Application Name: InsertFunApp"));
        System.out.println(ui.padRight("Author Name: Tyler Shinkle"));
        System.out.println(ui.padRight("Section Number: ITDEV 110-002"));
        System.out.println(ui.padRight("Assignment Number: 6"));
        System.out.println(ui.stars);
        System.out.println(ui.padRight("APPLICATION DESCRIPTTION"));
        System.out.println(ui.padRight("This application prompts the user to input several word types such as"));
        System.out.println(ui.padRight("noun, adjective, verb , animal etc. Once the users input is gathered a"));
        System.out.println(ui.padRight("poem is constructed filling in a template with their word choices."));
        System.out.println(ui.stars);
        System.out.println(ui.padRight("USER INSTRUCTIONS"));
        System.out.println(ui.padRight("When prompted input a word of your choice of the specified type. If you"));
        System.out.println(ui.padRight("wish to quit enter 'q'. Otherwise you will continue to be prompted for input."));
        System.out.println(ui.padRight("Once all the fields for a 'poem' are collected the poem will be displayed and you"));
        System.out.println(ui.padRight("will be asked if you want to continue. Press 'Enter' to continue and restart the"));
        System.out.println(ui.padRight("process or enter 'q' to quit the application."));
        System.out.println(ui.stars);
    }  
    
    //a method which displays the shutdown message then shuts down the application.
    public static void exit()
    {
        System.out.println(" Application closing...\n Have a fun day!");
        System.exit(0);
    }
}
