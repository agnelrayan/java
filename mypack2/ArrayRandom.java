package mypack2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by agnel on 6/1/18.
 */
public class ArrayRandom {
    public static void main(String[] args) {
        int ar[] ={10,30,20,40,12,16};
        Random r = new Random();
        for(int i=1;i<ar.length-1;i++){

                //Scanner obj = new Scanner(System.in);
                int t=0;
                int ind=r.nextInt(i);
                t=ar[ind];
                ar[ind]=ar[i];
                ar[i]=t;




            }
        System.out.println(Arrays.toString(ar));


    }
}
