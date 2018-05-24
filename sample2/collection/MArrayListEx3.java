package com.expertzlab.sample2.collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by agnel on 5/21/18.
 */
public class MArrayListEx3 {
    public static void main(String[] args) throws Exception{
        ArrayList<ArrayListEx3> li = new ArrayList();
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        String str;
        while((str= br.readLine())!=null){
            String[] x=str.split(",");
            li.add(new ArrayListEx3(Integer.parseInt(x[0]),x[1],Integer.parseInt(x[2])));

        }

        for(ArrayListEx3 obj:li){
            System.out.println(" Id: "+obj.id+" Name: "+obj.name+" Marks: "+obj.marks);
        }
    }
}
