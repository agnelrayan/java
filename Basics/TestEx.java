package com.expertzlab.Basics;

import java.util.Arrays;

public class TestEx {
    public static void main(String[] args) {



               // Thread t = Thread.currentThread();

                //System.out.println(t);

        int array[] = new int [5];

        for (int i = 5; i > 0; i--)

            array[5 - i] = i;

        Arrays.sort(array);

        for (int i = 0; i < 5; ++i)

            System.out.print(array[i]);

    }



            }




