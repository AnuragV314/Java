package Inheritance;

public class JavaInheritance {
    String brand = "Ford"; // JavaInheritance attribute
    public void roar() { // JavaInheritance method
        System.out.println("hrrr tuuuutt tuuuuuut!");
    }
}

class Car extends JavaInheritance{
   String modelName = "Mustang" ; // Car attribute
   public static void main(String[] args) {
    // create car  object
    Car car = new Car();

    car.roar(); // call the roar(from the JavaInheritance class)

    System.out.println(car.brand + " " + car.modelName);
   }
}