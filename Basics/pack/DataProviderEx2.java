package com.expertzlab.Basics.pack;

/**
 * Created by agnel on 4/25/18.
 */
public class DataProviderEx2 {
    public static void main(String[] args) {
        DataProviderEx2 obj = new DataProviderEx2();
        Object[][] greet = obj.getGreet();

        for(Object  word:greet){
            System.out.println(word.toString());
        }

        Integer[] intObj =obj.getInt();

        for(Object intObj2:intObj){
            System.out.println(intObj2);
        }

    }

    public Object[][] getGreet(){
        return new Object[][]{{"hi","helo"},{"helo","hw"}};
    }

    public Integer[] getInt(){
        return new Integer[]{1,10,20};
    }
}

//int a[][] = new int[5][2];