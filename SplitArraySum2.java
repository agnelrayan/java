/**
 * Created by agnel on 6/3/18.
 */
public class SplitArraySum2 {


    public static int findSplitPoint(int ar[],int n){

        int leftSum=0;
        for(int i=0;i<n;i++){
            leftSum+=ar[i];

            int rightSum=0;

            for(i=n-1;i>=0;i--){
                rightSum+=ar[i];
                leftSum-=ar[i];

                if(rightSum==leftSum)
                    return i;
            }
        }



        return -1;

    }

    public static void printTwoParts(int ar[],int n){

        int splitPoint=findSplitPoint(ar,n);

        if(splitPoint==-1||splitPoint==n){
            System.out.println("Not Possible");
            return;
        }

        for(int i=0;i<n;i++){
            if(splitPoint==i)
                System.out.println();
            System.out.print(ar[i]+ " ");

        }

    }
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,5};
        int n=ar.length;
        printTwoParts(ar,n);
    }
}
