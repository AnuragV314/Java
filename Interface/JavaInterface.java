package Interface;

/*
 An interface is a completely "abstract class" that is 
 used to group related methods with empty bodies.
 */

interface Animal{
    public void animalSound();//interface method (does not have body)
    public void sleep(); // interface method (does not have a body)
}

// Pig "Implements" the Animal interface
class Pig implements Animal{
    public void animalSound(){
        // Teh body of animalSound() is provided here
        System.out.println("The pig says: wee wee...");
    }

    public void sleep(){
        // The body of sleep is provided here
        System.out.println("Zzz...");
    }
}

class Dog implements Animal{
    public void animalSound(){
        System.out.println("The dog says: bow bow...");
    }
    public void sleep(){
        System.out.println("Zzz...");
    }
}


public class JavaInterface {
    public static void main(String[] args){
        Pig pig = new Pig();
        Dog dog = new Dog();

        pig.animalSound();
        pig.sleep();

        dog.animalSound();
        dog.sleep();
    }

}

/*
 * Notes on Interfaces:
 * 
 * 1) Like abstract classes, interfaces cannot be used to create objects (in the
 * example above, it is not possible to create an "Animal" object in the
 * MyMainClass)
 * 2) Interface methods do not have a body - the body is provided by the
 * "implement" class
 * 3) On implementation of an interface, you must override all of its methods
 * 4) Interface methods are by default abstract and public
 * 5) Interface attributes are by default public, static and final
 * 6) An interface cannot contain a constructor (as it cannot be used to create
 * objects)
 * 
 * Why And When To Use Interfaces?
 * 
 * 1) To achieve security - hide certain details and only show the important
 * details of an object (interface).
 * 
 * 2) Java does not support "multiple inheritance" (a class can only inherit
 * from one superclass). However, it can be achieved with interfaces, because
 * the class can implement multiple interfaces.
 * Note: To implement multiple interfaces, separate them with a comma (see
 * example below).
 */
