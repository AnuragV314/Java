package Methods;

public class JavaMethodParameter {
    static void myMethod(String fname) { // fname -- Parameter
        System.out.println(fname + " " + "refsnes");
    }

    static void myMethod2(String fname, int age) {
        System.out.println(fname + " " + age);
    }

    static int myMethod3(int x) {
        return 5 + x;
    }

    static int myMethod4(int x, int y) {
        return x + y;
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied.");
        }
        else{
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {
        myMethod("Anurag"); // Anurag -- Arguments
        myMethod("Shanu");
        myMethod("Python");

        myMethod2("Anurag", 22);

        System.out.println(myMethod3(5));

        System.out.println(myMethod4(5, 5));

        checkAge(22);
    }
}
