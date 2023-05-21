package Iterator;

/*
 * An Iterator is an object that can be used to loop 
 * through collections, like ArrayList and HashSet. 
 * It is called an "iterator" because "iterating" is the 
 * technical term for looping.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {
    public static void main(String[] args) {
        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();
        // print the first name
        System.out.println(it.next());

        // Looping through a collection -- hasNext() -- next()
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        // Removing Items from a Collection -- remove()
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(12);
        num.add(11);
        num.add(8);
        num.add(2);
        num.add(23);
        Iterator<Integer> iit = num.iterator();
        while(iit.hasNext()){
            Integer i = iit.next();
            if(i<10){
                iit.remove();
            }
        }
        System.out.println(num);
    }
}
