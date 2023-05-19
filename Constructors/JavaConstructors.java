package Constructors;

/*A constructor in Java is a special method that is used 
to initialize objects. "The constructor is called when an 
object of a class is created". It can be used to set 
initial values for object attributes */

public class JavaConstructors {
    int x;
    String modelName;
    int modelYear;


    public JavaConstructors(){
        x = 5;
    }

    public JavaConstructors(int year, String name){
        modelName = name;
        modelYear = year;
    }

    public static void main(String[] args) {
        JavaConstructors obj = new JavaConstructors();
        System.out.println(obj.x);

        JavaConstructors obj2 = new JavaConstructors(1969, "Mustang");
        System.out.println(obj2.modelYear+ " " + obj2.modelName);
    }
}
