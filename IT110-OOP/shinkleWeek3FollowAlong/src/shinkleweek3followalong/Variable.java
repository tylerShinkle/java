package shinkleweek3followalong;
//String , int, double, boolean, char ... review
//strings have "string" chars have 'char'

//150 resource... https://www.techwalla.com/articles/relational-database-vs-hierarchical-database

public class Variable {
    //variables are memory chunks whose values vary.
    //define variables under class definintion
    //variable declaration -> dataType varName assignmentOperator(optional) value(optional);
    int a = 3;
    int b = 4;
    int myAnswer;
    int age = 28; 
    String myName = "Tyler Shinkle";
    boolean isFriendly = true;
    char firstInitial = 'T';
    double salary = 40000.55;
    
    //constructor method
    public Variable(){
        calculate(4,9,4);
        /*
        System.out.println(myAnswer);
        System.out.println("My name is "+myName+".");
        System.out.println("My age is "+age+".");
        System.out.println("My salary in 5 years is $"+salary+".");
        System.out.println("My first initial is "+firstInitial+".");
        */
    }
    
    //private / protected public etc...(access modifiers)
    //accessModifier returnType methodName (parameterList)
    //parameter lists ask for what a method needs to perform various tasks.
    //must return return type if given (of same type)
    public void calculate(int a, int b, int c){
        myAnswer=a+b+c;
        System.out.println(myAnswer);
    }

}
