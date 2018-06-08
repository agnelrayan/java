package com.expertzlab.Basics;

/**
 * Created by agnel on 3/6/18.
 */
public class Maximum {
    //static int ar[]={10,1,20,40,30};
    //static int i;
    //static int max=ar[0];
    public static void main(String[] args) {
        int i;
        int ar[]={10,1,20,40,30};
        int max=ar[0];

        for(i=1;i<ar.length;i++){
            if(max<i) {
                max = ar[i];
            }
           // System.out.println("Maximum"+max);
            }
        System.out.println("Maximum"+max);
        }
    }

