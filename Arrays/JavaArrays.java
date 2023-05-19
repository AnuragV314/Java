package Arrays;

public class JavaArrays{
    public static void main(String[] args){
        String[] car = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {1,2,3,4,5,6,7,8,9,10};

        // access the elements of array.
        System.out.println(car[0]);
        System.out.println(myNum[0]);

        // change the array element.
        car[0] = "Opel";
        System.out.println(car[0]);

        // array length.
        System.out.println(car.length);

        // access all element
        
        for(String i: car){
            System.out.println(i);
        }

        // or.
        for(int i=0; i<car.length; i++){
            System.out.println(car[i]);
        }


        // Multidimensional Arrays
        int[][] mynumbers = {{1,2,3,4,5}, {6,7,8}};
        System.out.println(mynumbers[1][2]);
    }
}