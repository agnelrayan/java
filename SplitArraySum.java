/**
 * Created by agnel on 6/3/18.
 */
public class SplitArraySum {


    public static int findSplitPoint(int ar[],int n){

        int leftSum=0;

        for(int i=0;i<n;i++){
            leftSum+=ar[i];

            int rightSum=0;

            for(int j=i+1;j<n;j++){
                rightSum+=ar[j];
            }

            if(leftSum==rightSum)
                return i+1;

        }
        return -1;

    }

    public static void printTwoParts(int ar[],int n){

        int splitPoint=findSplitPoint(ar,n);

        if(splitPoint==-1 ||splitPoint==n){
            System.out.println("Not Possible");
            return ;
        }

        for(int i=0;i<n;i++){
            if(splitPoint==i)
                System.out.println();
            System.out.println(ar[i]+" ");

        }



    }



    public static void main(String[] args) {
        int ar[]={20,10,0,10};
        int n=ar.length;
        printTwoParts(ar,n);
    }

}
