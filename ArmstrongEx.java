/**
 * Created by agnel on 5/31/18.
 */
public class ArmstrongEx {
    public static void main(String[] args) {
        int n=153;
        int c=0;
        int a=0;
        int temp;
        temp=n;
        while(n>0){

            a=n%10;
            n=n/10;
            c=c+(a*a*a);


        }
        System.out.println(c);
        if(temp==c)
            System.out.println("Is Armstrong");
        else
            System.out.println("Not Armstrong");

    }
}
