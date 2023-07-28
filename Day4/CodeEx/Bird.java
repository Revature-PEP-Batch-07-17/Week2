package Week2.Day4.CodeEx;

public class Bird {
    String name;
    int age;
    boolean canFly;

    public Bird(String name, int age, boolean canFly){
        this.name = name;
        this.age = age;
        this.canFly = canFly;
    }

    public void makeSound(){
        System.out.println("I am a bird and I make a Chirp noise");
    }

    public void birdInfo(){
        System.out.println("Hello, my name is " + name + "and I am " + age + " years old");
    }
}
