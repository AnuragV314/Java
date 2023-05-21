package WrapperClasses;

public class JavaWrapperObjects {
    public static void main(String[] args) {

        // ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
        // ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid
        Integer myInt = 555;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        System.out.println(myInt.intValue());

        String myStringg = myInt.toString();
        System.out.println(myStringg.length()); 
    }
}
