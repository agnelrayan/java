package com.expertzlab.RegularEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the regular Expression");

       // String str = obj.nextLine();

        Pattern p = Pattern.compile(obj.nextLine());

        System.out.println("Enter the text");

        Matcher m = p.matcher(obj.nextLine());

        //String str2 = obj.nextLine();

        boolean found=false;

        int count=0;
        while(m.find()){

            count++;
            System.out.println("Starting index:"+m.start()+"End index:"+m.end()+ "Group:"+m.group()+"Occurance:"+count);
            found=true;

        }
        System.out.println("Occurances:"+count);
        if(!found)
            System.out.println("No match found");

    }
}
