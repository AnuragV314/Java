package BreakContinue;

public class JavaBreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("**********");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("**********");

        int i = 0;
        while (i < 10) {
            
            if (i == 4) {
                // break;
                i++;
                continue;
            }
            System.out.println(i);
            i++;

        }
    }
}