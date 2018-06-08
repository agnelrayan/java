package com.expertzlab.examples;


import java.util.HashMap;
import java.util.Map;

public class Answers {

    String id;
    String answers;

    @Override
    public String toString() {
        return "Answers{" +
                "id='" + id + '\'' +
                ", answers='" + answers + '\'' +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Answers)) return false;

        Answers answers1 = (Answers) o;

        if (!getId().equals(answers1.getId())) return false;
        return getAnswers().equals(answers1.getAnswers());

    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getAnswers().hashCode();
        return result;
    }

    public Answers(String id, String answers) {
        this.id = id;
        this.answers = answers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public static void main(String[] args) throws Exception{
        int total=0;
        HashMap<Integer,Questions> qmap = new HashMap<Integer, Questions>();
        qmap.put(1,new Questions("1","What is Java?",5,"A"));
        qmap.put(2,new Questions("2","What is C?",5,"B"));
        qmap.put(3,new Questions("3","What is C++?",5,"C"));
        qmap.put(4,new Questions("4","What is Html?",5,"A"));
        //System.out.println(map);

        for(Map.Entry entry:qmap.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }

        HashMap<String,AnswerKey> keymap = new HashMap();
        keymap.put("1",new AnswerKey("A"));
        keymap.put("2",new AnswerKey("B"));
        keymap.put("3",new AnswerKey("C"));
        keymap.put("4",new AnswerKey("A"));

        for(Map.Entry entry2:keymap.entrySet()){
            System.out.println(entry2.getKey()+","+entry2.getValue());
        }

       /* int i;
        for(i=0;i<=5;i++) {
            if (answermap.get(i).answers.equals(keymap.get(i).answers)) {
                total = answermap.get(i).marks;
                System.out.println("Total" + total);
            }
        }*/
       // System.out.println("Total"+total);



        for(int i=0;i<=3;i++)
        {

            //System.out.println(questMap.get(i).question);
            // System.out.println(questMap.get(i).answer);

            // System.out.println(ansKeyMap.get(i).answer);


            if(qmap.get(i).answers.equals(keymap.get(i).answers)){
                total=total+qmap.get(i).marks;
            }
            // System.out.println(total);

        }
        System.out.println(total);
    }


}
