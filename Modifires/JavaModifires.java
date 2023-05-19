package Modifires;

/* Final: 
        If you don't want the ability to 
        override existing attribute values, declare 
        attributes as final */

/*Static & public:
    A static method means that it can be accessed 
    without creating an object of the class, unlike 
    public: */

/*Abstract:
    An abstract method belongs to an abstract class, 
    and it does not have a body. The body is provided 
    by the subclass */ //(kyaBatHai)

public class JavaModifires {
    final int x = 10;
    final double PI = 3.14;

    // static method
    static void staitcMethod() {
        System.out.println("Static method can be called without creating objects.");
    }

    // public method
    public void publicMethod() {
        System.out.println("Public method must be called by creating objects.");
    }


    public static void main(String[] args) {
        JavaModifires obj = new JavaModifires(); // Create an object.
        // obj.x = 12; // error
        // obj.PI = 4.2; // error

        staitcMethod(); // Call the static method
        // publicMethod(); This would output an error
        obj.publicMethod(); // Call the public method


        Student a = new Student();
        System.out.println("Name: "+ a.fname);
        System.out.println("Age: " + a.age);
        a.study();
    }
}
