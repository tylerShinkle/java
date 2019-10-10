//Tyler Shinkle ITDEV 110 Assignment #2
package shinkle_assignment2;

import java.util.Date;

public class AboutMe {
    //declare variables
    Date myDate;
    String[] infoArr = new String[5];

    //constructor
    public AboutMe(String name,String assignmentNum, String courseNum, String courseName, String instructorName, Date date){
        //assign values to an array
        this.infoArr[0]=name;
        this.infoArr[1]="Assignment "+assignmentNum;
        this.infoArr[2]=courseNum;
        this.infoArr[3]=courseName;
        this.infoArr[4]=instructorName;
        this.myDate=date;
        
        //format all values in array;
        for(int i=0;i<5;i++){
            this.infoArr[i]=String.format("%-20s",infoArr[i]);
        }
    
    }
    
    
     void DisplayInfo(){
        //String.format("%-20s",name);
        System.out.println(this.infoArr[0]+this.infoArr[1]+"\n"+this.infoArr[2]+this.infoArr[3]+"\n"+this.infoArr[4]+this.myDate);
        }
    }
