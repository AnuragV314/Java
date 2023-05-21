package Exceptions; // -- try...catch

public class JavaExceptions {
    public static void main(String[] args){
        try{
            int[] num = {1,2,3};
            System.out.println(num[10]);
        }
        catch(Exception e){
            System.out.println("Somthing is worng.");
        }
        finally{
            System.out.println("Teh 'try catch' is finished.");
        }

        checkAge(15); // Set age to 15 (which is below 18... 
        
    }
    // The throw keyword
    static void checkAge(int age){
        if (age<18){
            throw new ArithmeticException("Access denid - You must be at least 18 years old.");
        }
        else{
            System.out.println("Access granted - You are old enough!");
        }
    }
    

}
