import java.util.Scanner;

/**
 * Created by agnel on 5/31/18.
 */
public class ReadEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the a value");
        int a=input.nextInt();

        System.out.println("Enter the b value");
        int b=input.nextInt();

        int c=a+b;
        System.out.println("Addition of Two Numbers:"+c);
    }
}
