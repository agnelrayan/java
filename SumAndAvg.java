/**
 * Created by agnel on 5/31/18.
 */
public class SumAndAvg {
    public static void main(String[] args) {
        int ar[]={10,30,20,40};
        int sum=0;
        int n=ar.length;
        System.out.println("Size of Array:"+n);


        for(int i:ar){
           // System.out.println(i);
            sum=sum+i;
        }
        System.out.println("Average:"+(sum/n));
                ///ar.length));

    }
}
