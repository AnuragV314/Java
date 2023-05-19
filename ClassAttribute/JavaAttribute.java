package ClassAttribute;

public class JavaAttribute {
    int x = 5;
    final int y = 7; 

    String fname = "Anurag";
    String lname = "Verma";
    int age = 22;
    public static void main(String[] args){
        JavaAttribute obj = new JavaAttribute();
        System.out.println(obj.x); // accessing the Attribute/field

        // Modify Attributes
        obj.x = 90;
        System.out.println(obj.x);

         // obj.y = 80; // Error bacuase y is final
         System.out.println(obj.y);
    }
}
