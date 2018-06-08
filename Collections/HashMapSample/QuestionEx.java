package com.expertzlab.Collections.HashMapSample;


import java.util.HashMap;
import java.util.Map;

public class QuestionEx {
    public static void main(String[] args) {
        int total=0;
        int i;
        Map<Integer,Quest> questMap = new HashMap<Integer, Quest>();
        questMap.put(1,new Quest(1,"who are","A",50));
        questMap.put(2,new Quest(2,"How is","B",50));
        questMap.put(3,new Quest(3,"how many","C",50));
        questMap.put(4,new Quest(4,"what is","C",50));

       // System.out.println(questMap);

        Map<Integer,AnsKey> ansKeyMap = new HashMap<Integer, AnsKey>();
        ansKeyMap.put(1,new AnsKey("A"));
        ansKeyMap.put(2,new AnsKey("B"));
        ansKeyMap.put(3,new AnsKey("C"));
        ansKeyMap.put(4,new AnsKey("C"));
      //  System.out.println(ansKeyMap);

        //To see all the keys in the map
        System.out.println("Iterating all Keys in the Map");
        for (Integer key :questMap.keySet()) {
            System.out.println(key);
        }

        //To see all the values of the map
        System.out.println("Iterating all Values in the Map");
        for (Quest value :questMap.values()) {
            System.out.println(value.question);
            System.out.println(value.mark);
        }

        System.out.println("Iterating through both key and values");
        for (Map.Entry<Integer,Quest> entry  :questMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().question );
            System.out.println(entry.getValue().mark );
        }

        for(i=1;i<5;i++)
        {

        //System.out.println(questMap.get(i).question);
       // System.out.println(questMap.get(i).answer);

       // System.out.println(ansKeyMap.get(i).answer);


        if(questMap.get(i).answer.equals(ansKeyMap.get(i).answer)){
            total=total+questMap.get(i).mark;
        }
       // System.out.println(total);

    }
        System.out.println(total);
}}
class Quest{
    int id;
    String question;
    String answer;
    int mark;

    @Override
    public String toString() {
        return "Quest{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }



    public Quest(int id, String question, String answer, int mark) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.mark = mark;
    }


}
class AnsKey{
    String answer;
    @Override
    public String toString() {
        return "AnsKey{" +
                "answer='" + answer + '\'' +
                '}';
    }


    public AnsKey(String answer) {
        this.answer = answer;
    }


}