//package declaration
package shinkle_practiceobjects;

//class declaration
public class MathFun {
//Tyler Shinkle ITDEV 110-002 Assignment #5

    //private integers declared
    private int number1, number2;

    //method to multiply our two private integers.
    public int multiplyThem()
    {
        return number1*number2;
    }

    //method to add our two private integers.
    public int addThem()
    {
        return number1+number2;
    }

    //getters for getting the value of private integers from outside classes.
    public int getNumber1()
    {
        return number1;
    }

    public int getNumber2()
    {
        return number2;
    }
    
    //setters for setting the value of private integers from outside classes.
    public void setNumber1(int num)
    {
        number1=num;
    }
    
    public void setNumber2(int num)
    {
        number2=num;
    }
}
