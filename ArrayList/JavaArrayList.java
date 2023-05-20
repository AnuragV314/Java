package ArrayList;
/*The ArrayList class is a resizable array, which can be found in the java.util package. */

import java.util.ArrayList;
import java.util.Collections;

public class JavaArrayList {
    public static void main(String[] args) {
        // create an ArrayList object
        ArrayList<String> cars = new ArrayList<String>();

        // Add Items -- add()
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        // Access an Item -- get()
        System.out.println(cars.get(1));

        // Change an Item -- set()
        cars.set(0, "Opel");
        System.out.println(cars);

        // Remove an Item -- remove()
        cars.remove(0);
        System.out.println(cars);

        // Remove All Item -- clear()
        // cars.clear();
        System.out.println(cars);

        // size -- size()
        System.out.println(cars.size());

        // loop through an ArrayList
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        
        // Sort an ArrayList of Integers:

        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        Numbers.add(33);
        Numbers.add(15);
        Numbers.add(20);
        Numbers.add(34);
        Numbers.add(8);

        Numbers.add(12);

        Collections.sort(Numbers); // Sort Numbers

        for (int i : Numbers) {
            System.out.println(i);
        }
    }

}
