/**
 * Created by agnel on 5/31/18.
 */
public class SecondMin {
    public static void main(String[] args) {
        int ar[] ={101,1,-1,10,4,2,102,89,50,0,-2,100};
        int min=ar[0];
        for(int i=1;i<ar.length;i++){
            if(ar[i]<min){
                min=ar[i];


            }

        }
        //int temp=min;
        int smin=ar[0];
        for(int i=1;i<ar.length-1;i++){
            if(ar[i]<smin && ar[i]>min){
                smin=ar[i];
            }
        }

        //System.out.println("Minimum:"+min);
       System.out.println("Second Minimum:"+smin);
    }
}
