package com.expertzlab.Collections.ArrayListSamples;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("ab.txt"));
        ArrayList<StudentList> studentlist = new ArrayList<StudentList>();
        String str;
        while((str=br.readLine())!=null){
            String x[] = str.split(",");
            studentlist.add(new StudentList(Integer.parseInt(x[0]),x[1],Integer.parseInt(x[2]),Integer.parseInt(x[3]),Integer.parseInt(x[4])));

        }

        for(StudentList studlist:studentlist){
            System.out.println("Id:"+studlist.id+","+"Name:"+studlist.name+","+"Mark1:"+studlist.mark1+","+"Mark2:"+studlist.mark2+","+"Mark3:"+studlist.mark3);
        }
    }
}
