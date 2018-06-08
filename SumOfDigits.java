/**
 * Created by agnel on 6/1/18.
 */
public class SumOfDigits {
    public static void main(String[] args) {
        int sum=0;
        int n=140;
        while(n>0){
            sum+=n%10;
            n=n/10;

        }
        System.out.println(sum);
    }
}
