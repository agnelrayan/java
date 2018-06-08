package exceptionex;

/**
 * Created by agnel on 6/6/18.
 */
public class ExceptionEx {
    public static void main(String[] args)  {

        int a=10;
        int b=0;
        try {
            int c = a / b;
            System.out.println(c);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Handled...");

        }
        System.out.println("Allow me to Continue");
        System.out.println("Allow me to Continue");
        System.out.println("Allow me to Continue");
        System.out.println("Allow me to Continue");
        System.out.println("Allow me to Continue");

    }

}
