package com.expertzlab.arrays;


public class BubbleSortEx {

    static int i,j,n,temp=0;
    static void bubbleSort(int[] arr) {
        n = arr.length;
        //temp = 0;
        for(i = 0; i < n; i++) {
            for(j=1; j < (n-i); j++) {
                if(arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void bubbleSortA(int[] a){
        n=a.length;
        for(i=0;i<n-1;i++){
            for(j=0;j<(n-i-1);j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }


    }

    public static void main(String[] args) {
        int i;
        int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        System.out.println("Array Before Bubble Sort");

        for(i = 0; i < arr.length; i++) {
         //   System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("Array After Bubble Sort");

        for(i = 0; i < arr.length; i++) {
          //  System.out.print(arr[i] + " ");
        }

        int arr2[] = {2,3,1,6,7,5,90,10};

        System.out.println("Array Before Bubble Sort---->");
        for(i=0;i<arr2.length;i++) {
        System.out.print(arr2[i] + " ");
        }
            System.out.println();
            bubbleSortA(arr2);
            System.out.println("Array After Bubble Sort--->");

        for(i=0;i<arr2.length;i++)
            System.out.print(arr2[i]+" ");



    }
}
