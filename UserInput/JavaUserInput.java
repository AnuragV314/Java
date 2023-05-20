package UserInput;

/*
The Scanner class is used to get user input, and it 
is found in the java.util package. 
*/

import java.util.Scanner; // Import the Scanner class

public class JavaUserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // Creater a Scanner object
        System.out.println("Enter username");

        String username = scanner.nextLine(); //Read user input
        System.out.println("Username is: " + username);
    }
}


/* 
<===Input Types===>

METHOD	DESCREPTION
nextBoolean()	Reads a boolean value from the user
nextByte()	Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()	Reads a float value from the user
nextInt()	Reads a int value from the user
nextLine()	Reads a String value from the user
nextLong()	Reads a long value from the user
nextShort()	Reads a short value from the user

*/