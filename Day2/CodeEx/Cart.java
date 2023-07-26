package PEP.Week2.Day2.CodeEx;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public static void main(String[] args){
        List<String> cart = new ArrayList<String>();

        //add elements to our list
        cart.add("Apple");
        cart.add("Banana");
        cart.add("Orange");
        cart.add("Chicken");
        cart.add("Tomato");
        cart.add("Apple");

        for(int i = 0; i < cart.size(); i++){
            System.out.println(cart.get(i));
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Check if our cart contains "Banana"
        boolean hasBananas = cart.contains("Banana");
        System.out.println("Did I remember to put a banana in my cart? " + hasBananas);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //update the vale at a given index
        cart.set(5, "Green Apple");

        //remove the ele at an index
        cart.remove(1);

        //Enhanced for-loop
        //Not indexed (you can't choose to print a specific element)
        //Does the same thing as the first for-loop
        for(String item : cart){
            System.out.println(item);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("After getting all of my groceries let me check off my list");
        cart.clear();

        for(String item : cart){
            System.out.println(item);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        List<Double> adder = new ArrayList<Double>();

        adder.add(12.75);
        adder.add(2.0);
        adder.add(100.57);
        adder.add(-13.2);

        //int 2 -> Integer 2-> Double 2.0
        //int -> double
        //double -> Double

        double sum = 0;
        for(Double num : adder){
            sum = sum + num;
            System.out.println("The sum within my for loop is: " + sum);
        }
        System.out.println("The sum is: " + sum);
    }
}
