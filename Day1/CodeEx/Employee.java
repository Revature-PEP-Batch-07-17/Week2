package Week2.Day1.CodeEx;

public class Employee {
    String name;
    String dept;

    //This is the no-args constructor
    public Employee(){}

    //This is the parameterized constructor used to set the value
    public Employee(String name, String dept){
        this.name = name;
        this.dept = dept;
    }

    public void introduceYourself(){
        System.out.println("Hello I am " + name + " and I work in the " + dept + " department.");
    }

    public void getBonus(int numOfSales, double percentage){
        //Here we assume each sale is $600
        double totalBonus = (600 * numOfSales) * (percentage/100);
        System.out.println("This year you will get $" + totalBonus + " because you had " + numOfSales + " sales!");
    }

}
