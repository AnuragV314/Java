package Conditions;

public class JavaConditions {
    public static void main(String[] args) {
        int x = 111;
        int y = 111;
        if (x > y) {
            System.out.println("x is greater");
        } else if (y > x) {
            System.out.println("y is greater");
        } else {
            System.out.println("x=y");
        }

        // ternary operator
        // variable = (condition) ? expressionTrue :  expressionFalse;

        String result = (x>y)? "X is greater.": "y is greater.";
        System.out.println(result);
    }
}