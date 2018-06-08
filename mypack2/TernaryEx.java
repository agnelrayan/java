package mypack2;

/**
 * Created by agnel on 6/1/18.
 */
public class TernaryEx {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=0;
        c=(a>b)?a:b;
        System.out.println("Maximum is: "+c);

        String result = false ? "Its true" : "Sorry , it's false";
        System.out.println(result);
    }
}
