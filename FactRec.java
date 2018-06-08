/**
 * Created by agnel on 6/2/18.
 */
public class FactRec {

    public static int factMethod(int n){
        if(n==0)
            return 1;
        else

        return (n*factMethod(n-1));
    }

    public static void main(String[] args) {
        int i,fact=1;
        int n=5;
        fact = factMethod(n);
        System.out.println("Factorial of "+n+" is : "+fact);
    }


}
