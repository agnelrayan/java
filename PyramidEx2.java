/**
 * Created by agnel on 6/1/18.
 */
public class PyramidEx2 {
    public static void main(String[] args) {
        int i=0,j=0,k=0;
        for(i=0;i<=5;i++){
            for(j=0;j<=5-i;j++){
                System.out.print(" ");
            }

            for(k=0;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
