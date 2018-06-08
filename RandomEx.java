import java.util.Random;
import java.util.Scanner;

/**
 * Created by agnel on 6/2/18.
 */
public class RandomEx {
    public static void main(String[] args) {
        Random r = new Random();
     //   Scanner input = new Scanner(System.in);
        for(int j=0;j<5;j++) {
            int i = r.nextInt(10);
            System.out.println(i);
        }

    }
}
