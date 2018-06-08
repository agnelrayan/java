package com.expertzlab.arrays;

public class MyBubbleSort {

    // logic to sort the elements
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int j;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                //System.out.println("I:"+i);
                j = i + 1;
                //System.out.println("K:"+j);
                if (array[i] > array[j]) {
                    System.out.println("Array[i]:"+array[i]);
                    System.out.println("Array[j]:"+array[j]);
                    swapNumbers(i, j, array);
                }
            }
            printNumbers(array);
        }
    }

    private static void swapNumbers(int i, int j, int[] array) {

        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printNumbers(int[] input) {

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] input = { 9, 2, 6, 4 };
        bubble_srt(input);

    }
}
