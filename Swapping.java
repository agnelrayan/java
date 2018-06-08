/**
 * Created by agnel on 6/1/18.
 */
public class Swapping {
    public static void main(String[] args) {
        int a=100;
        int b=120;
        System.out.println("Before Swapping:"+a+","+b);
        //System.out.println("After Swapping:");

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("AFter Swapping:"+a+","+b);
    }
}
