package com.expertzlab.filehandling;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Created by geo on 11/10/17.
 */
public class DataInputStreamEx3 {
    public static void main(String[] args) throws Exception {
        //  BufferedReader br = new BufferedReader(new DataInputStream(System.in));
        DataInputStream br = new DataInputStream(System.in);
        System.out.println("Enter the Name");
        String str = br.readLine();
        System.out.println("Str value:" + str);
    }
}



      /*  System.out.println("Enter the Marks");
        String marks = br.readLine();
        Double marksDouble = Double.parseDouble(marks);

        System.out.println("The give Name is:"+str);
        System.out.println("The give Name is:"+marksDouble);
        //System.out.println("The give Name is:"+str);
        //String str = br.read();

      /*  System.out.println("Enter the Id");
        String id = br.readLine();
        int idStr = Integer.parseInt(id);

        System.out.println("The give Name is:"+str);
        System.out.println("The given Id is:"+idStr);

      /*  System.out.println("Enter the Marks");
        String marks = br.readLine();
        float marksStr = Float.parseFloat(marks);

        System.out.println("The give Name is:"+str);
        System.out.println("The given Id is:"+idStr);
        System.out.println("The given Mark is:"+marksStr);
    }
}*/
