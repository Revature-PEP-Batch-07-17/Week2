package Week2.Day4.CodeEx;

public class Main {
    public static void main(String[] args){
        Crow crow = new Crow("Bert", 2, true, "CROWCAAA");
        Bird crow2 = new Crow("Ernie", 3, true, "PEEP");


        crow.makeSound();
        crow.birdInfo();
        crow.makeSound("CAW");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

        crow2.makeSound();
        //can't call this overloaded method on crow2 
        //because it is of type bird so it only has access to Bird's methods
        //crow2.makeSound("HELLO");

    }
}
