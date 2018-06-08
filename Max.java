/**
 * Created by agnel on 5/31/18.
 */
public class Max {
    public static void main(String[] args) {
        int ar[] ={101,103,4,2};
        int max=ar[0];
        for(int i=1;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];


            }

        }
        //System.out.println("Maximum:"+max);
        int smax=ar[0];
        for(int i=1;i<ar.length;i++){
            if(ar[i]>smax &&ar[i]<max){
                smax=ar[i];
            }
        }
        System.out.println("Second Maximum:"+smax);
    }
}
