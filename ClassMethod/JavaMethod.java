package ClassMethod;

/*a static method, which means that it can be accessed 
without creating an object of the class, 
unlike public, which can only be accessed by objects */

public class JavaMethod {
    // static Method
    static void helloWorld() {
        System.out.println("Hello World!");
    }

    // public Method 
    public void helloWorld2() {
        System.out.println("Hello World! through public Method");
    }

    public static void main(String[] args) {
        helloWorld();
        // helloWorld2(); // it gives Error.

        JavaMethod obj = new JavaMethod();
        obj.helloWorld2();

        // obj.helloWorld(); // its gives result but not necessary.
    }

}
