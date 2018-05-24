package com.expertzlab.Collections.HashMapSample;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class HashMapEx4 {


    public static void main (String ...a){

        Map<String, Questions> questionsMap= new HashMap();

        Questions q1 = new Questions("What is ..?",1);
        Questions q2 = new Questions("Where is ...?",2);
        Questions q3 = new Questions("When is ...?",1);

        new Integer(10);
        //questionsMap.put(new Integer(1), q1 );
        //questionsMap.put(2, q2 );
        //questionsMap.put(3, q3 );
        questionsMap.put("aa", q1 );


        //Getting value object if we know the key
        System.out.println(questionsMap.get(1).question);
        System.out.println(questionsMap.get(1).mark);

        System.out.println(questionsMap.get(2).question);
        System.out.println(questionsMap.get(2).mark);

        System.out.println(questionsMap.get(3).question);
        System.out.println(questionsMap.get(3).mark);

        //To see all the keys in the map
        System.out.println("Iterating all Keys in the Map");
        for (String key :questionsMap.keySet()) {
            System.out.println(key);
        }

        /*
        //To see all the values of the map
        System.out.println("Iterating all Values in the Map");
        for (Question value :questionsMap.values()) {
            System.out.println(value.question);
            System.out.println(value.mark);
        }
        //To see both keys and values
        System.out.println("Iterating through both key and values");
        for (Map.Entry<Integer,Question> entry  :questionsMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().question );
            System.out.println(entry.getValue().mark );
        }
        */

    }

}
class Questions{
    String question;
    int mark;

    public Questions(String question, int mark) {
        this.question = question;
        this.mark = mark;
    }
}
