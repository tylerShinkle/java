//package declaration
package shinkle_practiceobjects;
//class declaraton
public class Shinkle_PracticeObjects {
//Tyler Shinkle ITDEV 110-002 Assignment #5
    static int calc1Num1, calc1Num2, calc2Num1, calc2Num2;

    //main method
    public static void main(String[] args) {
        //instantiate getReady object as a member of the Admin class.
        Admin getReady = new Admin();
        //call the intro method of the getReady object.
        getReady.intro();
        //instantiate calc1 and calc2...
        MathFun calc1 = new MathFun();
        MathFun calc2 = new MathFun();
        //set number1 and number2 for calc1 and calc2...
        calc1.setNumber1(5);
        calc1.setNumber2(8);
        calc2.setNumber1(9);
        calc2.setNumber2(7);
        //get values of number1 and number2 from both of our objects.
        calc1Num1=calc1.getNumber1();
        calc1Num2=calc1.getNumber2();
        calc2Num1=calc2.getNumber1();
        calc2Num2=calc2.getNumber2();
        //Display the value for number1 and number2 for each object.
        System.out.println("\tNumber 1 in calc1 is: "+calc1Num1);
        System.out.println("\tNumber 2 in calc1 is: "+calc1Num2);
        System.out.println("\tNumber 1 in calc2 is: "+calc2Num1);
        System.out.println("\tNumber 2 in calc2 is: "+calc2Num2);
        //Display the return value for addThem and multiply them for each object.
        System.out.println("\tOur adding function from calc 1 returns: "+calc1.addThem());
        System.out.println("\tOur multiplication function from calc 2 returns: "+calc1.multiplyThem());
        System.out.println("\tOur adding function from calc 2 returns: "+calc2.addThem());
        System.out.println("\tOur multiplication function from calc 2 returns: "+calc2.multiplyThem());
        getReady.goodbye();
        
        
    }

}
