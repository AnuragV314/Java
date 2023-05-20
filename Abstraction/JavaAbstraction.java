package Abstraction;

/*
    Abstract class: is a restricted class that cannot be 
        used to create objects (to access it, it must be 
        inherited from another class).

    Abstract method: can only be used in an abstract class, 
        and it does not have a body. The body is provided by the 
        subclass (inherited from). 
*/

// Abstract class
abstract class Animal{
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular Method
    public void sleep(){
        System.out.println("Zzz...");
    }
}
// Subcalss (Inherit from Animal)
class Pig extends Animal{
    public void animalSound(){
        // The body of animalSound() is  provided here
        System.out.println("The Pig says: wee wee...");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("The Dog says: bow bow...");
    }
}

public class JavaAbstraction {
    public static void main(String[] args) {
        Pig pig = new Pig();
        Dog dog = new Dog();

        pig.animalSound();
        pig.sleep();
        
        dog.animalSound();
        dog.sleep();
    }
}
