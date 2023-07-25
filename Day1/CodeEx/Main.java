package Week2.Day1.CodeEx;

public class Main {
    public static void main(String[] args){

        //this line actually creates the obj called calc
        Calculator calc = new Calculator();

        calc.doMath();

        Employee john = new Employee();
         john.name = "John";
         john.dept = "Sales";

        Employee kate = new Employee("Kate", "Technology");

        //john.introduceYourself();

        //kate.introduceYourself();

        john.getBonus(31, 21);
    }
}
