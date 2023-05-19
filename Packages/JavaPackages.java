package Packages;

//Java Packages & API

import java.util.Scanner;  //Scanner class to get user input. 

public class JavaPackages {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name: ");
        // String userName = obj.next();
        String userName = obj.nextLine();
        System.out.println("Username is: " + userName);
    }
}
