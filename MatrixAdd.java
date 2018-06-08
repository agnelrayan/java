/**
 * Created by agnel on 6/1/18.
 */
public class MatrixAdd {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{1,2,3}};
        int b[][]={{1,2,3},{1,2,3}};
        int c[][]=new int[2][3];
        int i,j;
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(" "+c[i][j]);
            }
            System.out.println();

        }


    }
}
