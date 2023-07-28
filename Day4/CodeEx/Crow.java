package Week2.Day4.CodeEx;

public class Crow extends Bird{
  String sound;

  public Crow(String name, int age, boolean canFly, String sound){
    super(name, age, canFly);
    this.sound = sound;
  }

  //Overriding changes the method body
  @Override
  public void makeSound(){
    System.out.println("I am a CROW and I make a Caw noise");
}


//Overloading changes the number, type order, or type of parameters
  public void makeSound(String sound){
    System.out.println("I am a crow and I make a " + sound + " noise " + this.sound);
}
}
