package Week2.Day4.CodeEx;

public class Penguin extends Bird{
    public Penguin(String name, int age, boolean canFly){
        super(name, age, canFly);
    }

    public void swim(int fish){
        System.out.println("As a Penguin, I LOVE to swim! Today, I caught " + fish + "!");
    }
}
