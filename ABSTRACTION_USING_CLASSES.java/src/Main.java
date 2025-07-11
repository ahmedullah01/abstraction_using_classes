import java.sql.SQLOutput;
//but its not a  pure abstraction bcz abstract class also contain some public methods

abstract class Animal {
abstract void eat();
Animal(){
    System.out.println("creating an animal");
}
public void walk(){
    System.out.println("walking ");
}
}

class horse extends Animal{
    public void eat(){
        System.out.println("horse eats");
    }
}
class chicken extends Animal{
    public void eat(){
        System.out.println("chicken eats");
    }
}

public class Main {
    public static void main(String[] args){
horse horse = new horse();
horse.eat();
chicken chicken = new chicken();
chicken.eat();
chicken.walk();

    }
}