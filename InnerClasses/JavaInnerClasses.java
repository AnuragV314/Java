package InnerClasses;

/* Java Inner Classes: 
In Java, it is also possible to nest classes (a class 
within a class). The purpose of nested classes is to 
group classes that belong together, which makes your 
code more readable and maintainable.

To access the inner class, create an object of the outer 
class, and then create an object of the inner class:*/

class OuterClass{
    int x = 10;
    
    // class InnerClass{
    //     int y = 5;
    // }

    // private class InnerClass{
    //     int y = 5;
    // }

    // static class InnerClass{
    //     int y = 5;
    // }

    class InnerClass{
        public int myInnerMethod(){
            return x;
        }
    }
}

public class JavaInnerClasses {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        // System.out.println(inner.y + outer.x);
        System.out.println(inner.myInnerMethod());
    }
}
