package Modifires;

/*Abstract: The class cannot be used to create objects. 
To access an abstract class, it must be inherited 
from another class. */

// Abstract class
abstract class kyaBatHai {
    public String fname = "Anurag";
    public int age = 22;

    public abstract void study(); // Abstract Method

}

// subclass (inherit from JavaModifires)
class Student extends kyaBatHai {
    public int graduationYear = 2018;

    public void study() { // the body of abstract method is provided here
        System.out.println("Studying all day long.");
    }

}