package com.expertzlab.Collections.HashMapSample;


import java.util.HashMap;
import java.util.Map;

public class HashMapEx3 {
    public static void main(String[] args) {
        Map<String, Question> map = new HashMap();

        Question q1 = new Question("What is?", 1);
        Question q2 = new Question("Who are u?",2);
        Question q3 = new Question("How many?",3);

        map.put("aa",q1);
        map.put("bb",q2);
        map.put("cc",q3);

        System.out.println(map);

      //  System.out.println(map.get(1).question);
        //System.out.println(map.get(2).question);
       // System.out.println(map.get(1).marks);

    }
}
    class Question{
        @Override
        public String toString() {
            return "Question{" +
                    "question='" + question + '\'' +
                    ", marks=" + marks +
                    '}';
        }

        String question;
        int marks;
        public Question(String question, int marks) {
            this.question = question;
            this.marks = marks;
        }






    }


