package com.expertzlab.Collections.PriorityQueueSample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.PriorityQueue;

public class PriorityQueueEx3 {
    public static void main(String[] args) {
        PriorityQueue<String> men = new PriorityQueue();
        PriorityQueue<String> women = new PriorityQueue();

        String line=null;
        String file="/home/geo/Desktop/dance.txt";
        String sex="";

        try{
            BufferedReader input = new BufferedReader(new FileReader(file));
            while((line=input.readLine())!=null){
                sex=line.substring(0,1);
                if(sex.equals('M')){
                    men.add(line.substring(2));
                }
                else{
                    women.add(line.substring(2));
                }
            }
            input.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

        while(!men.isEmpty()&&!women.isEmpty()){
            System.out.println("The dance Partners will be:");
            System.out.println(men.poll()+"and"+women.poll());
        }

        if(men.isEmpty()){
            System.out.println("There are"+women.size());
            System.out.println("women waiting to dance.");
            System.out.println(women.peek()+"is next women dancer");
        }
        if(women.isEmpty()){
            System.out.println("Therr are "+men.size());
            System.out.println("Men waiting to dance.");
            System.out.println(men.peek()+"is the next man dance");
        }

    }
}
