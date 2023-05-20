package HashMap;

/*
    A HashMap however, store items in "key/value" pairs, 
    and you can access them by an index of another type (e.g. a String).
 */

import java.util.HashMap;

public class JavaHashMap {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add Items -- put()
        // Add keys and values (Country, cities)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);

        // Access an Item -- get()
        System.out.println(capitalCities.get("England"));

        // Remove an Item -- remove()
        capitalCities.remove("England");

        // remove all item -- clear()
        // capitalCities.clear();

        // HashMap Size
        capitalCities.size();
        

        // Loop Through a HashMap (for-each loop.)
        /*
         * Note: Use the keySet() method if you only want
         * the keys, and use the values() method if you
         * only want the values:
         */

        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

    }
}
