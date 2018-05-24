package com.expertzlab.sample2.collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by agnel on 5/22/18.
 */
public class MStud {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        String str;
        ArrayList<Stud> li = new ArrayList();
        while((str=br.readLine())!=null){

            String[] x= str.split(",");
            li.add(new Stud(Integer.parseInt(x[0]),x[1],Integer.parseInt(x[2])));

        }

        for(Stud list : li){
            System.out.println("Id:"+list.id+"Name:"+list.name+"Marks:"+list.mark);
        }
    }
}
