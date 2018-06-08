import java.util.Arrays;

/**
 * Created by agnel on 6/1/18.
 */
public class ArraySplitEx {
    public static void main(String[] args) {
        int ar[] ={10,20,30,40,50,60};
        int n=ar.length;

        int a[] = new int[n/2];
        int b[] = new int[n-a.length];

        for(int i=0;i<ar.length;i++){

            int sum=0;

            if(i<a.length) {
                a[i] = ar[i];

                //System.out.println("Sum1:"+sum);
            }

            else
                b[i-a.length]=ar[i];


        }

        int sumA=0;
        for(int i:a){
            System.out.println(i);
            sumA=sumA+i;
        }
        System.out.println("a[i]:"+sumA);

        int sumB=0;
        for(int j:b){
            System.out.println(j);
            sumB=sumB+j;
        }
        System.out.println("b[i]:"+sumB);

       //System.out.println(Arrays.toString(a));
       //System.out.println(Arrays.toString(b));
    }
}
