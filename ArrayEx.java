/**
 * Created by agnel on 5/31/18.
 */
public class ArrayEx {
    public static void main(String[] args) {
        int ar[] ={10,30,20,40,60};

        int arr[];//declaration
        arr= new int[10];//instantiation
        arr[0]=10;//initialization
        arr[9]=90;
        System.out.println(arr[9]);

        System.out.println("Using Enhanced For Loop");
        for(int i:ar){
            System.out.println(i);
        }
    }
}
