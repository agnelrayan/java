/**
 * Created by agnel on 6/1/18.
 */
public class PrimeNo {
    public static void main(String[] args) {
        int num=5;
        boolean flag=false;
        int i;
        for(i=2;i<=num/2;i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

            if(!flag)
                System.out.println(num+" is a Prime Number");
            else
                System.out.println(num+" is not a Prime Number");
        }
    }

