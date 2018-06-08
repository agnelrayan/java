package com.expertzlab.filehandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class InputStreamBuffEx {
    public static void main(String[] args) throws Exception {
        //InputStreamReader in = new InputStreamReader(System.in);
        //BufferedReader br = new BufferedReader(in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Name");
        String str = br.readLine();


        System.out.println("Enter the id:");
        int id = Integer.parseInt(br.readLine());

        System.out.println("Enter the Marks:");
        float marks = Float.parseFloat(br.readLine());

        System.out.println("Enter the Marks");
        String mark2 = br.readLine();
        float marksStr = Float.parseFloat(mark2);

        System.out.println("Str value:"+str);
        System.out.println("Integer value:"+id);
        System.out.println("Marks:"+marks);
        System.out.println("Marks2:"+marksStr);





    }
}

      /* System.out.println("Enter the Double value");
        String marks = br.readLine();
        double marksDouble = Double.parseDouble(marks);

        System.out.println("Enter the Student age");
        String age = br.readLine();
        int ageInt = Integer.parseInt(age);

        System.out.println("The give Name is:"+str);
        System.out.println("The give Name is:"+marksDouble);
        System.out.println("The give Name is:"+ageInt);*/


       /* System.out.println("Enter the Id");
        String id = br.readLine();
        int idStr = Integer.parseInt(id);

        System.out.println("Enter the Marks");
        String mark2 = br.readLine();
        float marksStr = Float.parseFloat(mark2);

        System.out.println("The give Name is:"+str);
        System.out.println("The given Id is:"+idStr);
        System.out.println("The given Mark is:"+marksStr);
        System.out.println("The give Name is:"+str);
        System.out.println("The give Name is:"+marksDouble);
        }
        }
        */



