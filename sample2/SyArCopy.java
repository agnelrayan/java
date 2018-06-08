package com.expertzlab.sample2;

/**
 * Created by agnel on 5/16/18.
 */
public class SyArCopy {
    public static void main(String[] args) {
        int ar[] = new int[10];
        for(int c=0;c<10;c++){
            ar[c]=c;
        }

        int kr[] = ar;
        System.arraycopy(ar,0,kr,0,10);

        for(int c=0;c<10;c++){
            System.out.print(kr[c]);
        }

        for(int c=0;c<10;c++){
            ar[c]=ar[c]*2;
            System.out.print(ar[c]);
            System.out.println();
        }

        System.out.println(ar);
        System.out.println(kr);
    }
}
