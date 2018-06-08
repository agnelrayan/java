/**
 * Created by agnel on 5/31/18.
 */
public class ReverseNoEx {
    public static void main(String[] args) {
        int n=151;
        int temp=n;
        int r=0;
        while(n>0){
            r=r*10;
            r=r+(n%10);
            n=n/10;


        }
        System.out.println("Reverse is:"+r);

        if(temp==r)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");


    }
}
