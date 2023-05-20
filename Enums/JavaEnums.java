/* An enum is a special "class" that represents a group 
of constants (unchangeable variables, like final 
variables).

Enum is short for "enumerations", which means "specifically listed".
*/

enum Level {
    Low,
    Medium,
    High,
}

public class JavaEnums {
    // enum Level{
    // Low,
    // Medium,
    // High
    // }
    public static void main(String[] args) {
        Level a = Level.High;
        // System.out.println(a);

        switch (a) {
            case Low:
                System.out.println("Low level.");
                break;
            case Medium:
                System.out.println("Medium level.");
                break;
            case High:
                System.out.println("High level.");
                break;
        }
    }
}

/*
 * Difference between Enums and Classes
 * 
 * 1. An enum can, just like a class, have attributes and
 * methods. The only difference is that enum constants
 * are public, static and final (unchangeable - cannot be overridden).
 * 
 * 2. An enum cannot be used to create objects, and it
 * cannot extend other classes (but it can implement
 * interfaces).
 * 
 * 
 * Why And When To Use Enums?
 * 
 * Use enums when you have values that you know aren't
 * going to change, like month days, days, colors, deck of cards, etc.
 */
