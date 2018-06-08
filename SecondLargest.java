/**
 * Created by agnel on 5/31/18.
 */
public class SecondLargest {
    public static void main(String[] args) {

        int a[] ={10,74,30,46,20,36,78,45};
        int first =a[0];
        int i;
        int size=a.length;

        for(i=1;i<size;i++) {

            if (a[i] > first)
                first = a[i];

            //find Second Largest
        }
        int second=a[0];
        for(i=1;i<size;i++){
            if(a[i]>second&&a[i]<first){
                second=a[i];

            }

        }
        System.out.println(second);
    }
}
