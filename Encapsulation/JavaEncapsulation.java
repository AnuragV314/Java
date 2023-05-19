package Encapsulation;

/*Encapsulation
    The meaning of Encapsulation, is to make sure that 
    "sensitive" data is hidden from users. To achieve 
    this, you must:

        -- declare class variables/attributes as private
        -- provide public "get" and "set" methods to access 
            and update the value of a private variable 
        -- The "this" keyword is used to refer to the current object.*/

public class JavaEncapsulation {
    private String name;

    // Getter
    public String getName(){
        return name;
    }

    // Setter
    public void setName(String newName){
        this.name = newName;
    }

    public static void main(String[] args) {
        JavaEncapsulation obj = new JavaEncapsulation();
        // obj.name = "Anurag";
        // System.out.println(obj.name);

        obj.setName("Anurag");
        System.out.println(obj.getName());
    }
}
