package Methods;

// method overloading, multiple methods can have the same name with different parameters.

public class JavaMethodOverload {
    static int plusMethod(int x, int y){
        return x + y;
    }
    static double plusMethod(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(plusMethod(2, 4));
        System.out.println(plusMethod(2.2, 5.5));
    }
}
