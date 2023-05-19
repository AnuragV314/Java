package Strings;

// The + operator can be used between strings to combine them. This is called concatenation:

public class JavaStrings{
    
    public static void main(String[] args){
        String fname = "Anurag";
        String lname = "Verma";
        String text = "Hii \"Anurag\" kaise ho?";
        System.out.println(fname + " " + lname);
        System.out.println(fname.concat(lname));
        System.out.println(text);

        //Methods of strings.

        // length()
        System.out.println(fname.length());

        // toUpperCase and toLowerCase
        System.out.println(fname.toUpperCase());
        System.out.println(fname.toLowerCase());

        //insexOf
        System.out.println(text.indexOf("ho"));
    }
}