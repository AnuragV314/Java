package Loops;

public class JavaForLoop {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Nested Loops
        for (int i = 1; i <= 2; i++) {
            System.out.println("i"+i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("j"+j);
            }
        }

        // For-Each Loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String i : cars){
            System.out.println(i);
        }

    }

}
