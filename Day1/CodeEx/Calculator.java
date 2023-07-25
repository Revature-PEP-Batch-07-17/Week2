package Week2.Day1.CodeEx;

public class Calculator {

    //no-args constructor for this class
    public Calculator(){}


    public void doMath(){
        
        //int has 32 bits of memory, no decimals
        int i = 20;
        //float has 32 bits of memory AND decimals
        float f = 25.5f;

        float floatSum = i + f;
        System.out.println("Float sum: " + floatSum);


        //must explicitly cast f to an int
        //since there is potential for data loss
        int intSum = i + (int)f;
        //we can also write the above line as:
        // int intSum = (int)(i + f);
        System.out.println("intSum: " + intSum);

        //We can also cast when we assign variables a value
        double iToDouble = i;
        System.out.println("int to double: " + iToDouble);

        //doubles have 64 bits AND decimals
        double d = 92.63;
        int dToInt = (int)d;
        System.out.println("double to int: " + dToInt);
    }
}
