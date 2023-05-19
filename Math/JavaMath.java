package Math;

public class JavaMath{
    public static void main(String[] args){
        System.out.println(Math.max(5, 8));
        System.out.println(Math.min(5, 8));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.abs(-4.6));
        System.out.println(Math.random());

        int randomNum = (int)(Math.random()*101); // 0 to 100
        System.out.println(randomNum);
    }
}