package HashSet;

/*
 * A HashSet is a collection of items where every item 
 * is unique, and it is found in the java.util package:
 */

import java.util.HashSet;

public class JavaHashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

        // Check If an Item Exists -- contains()
        cars.contains("Mazda");

        // Remove an Item -- remove -- clear
        cars.remove("Volvo");
        // cars.clear();

        // HashSet Size
        cars.size();

        // Loop Through a HashSet
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
