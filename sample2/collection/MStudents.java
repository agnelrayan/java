package com.expertzlab.sample2.collection;

import java.util.LinkedHashSet;

/**
 * Created by agnel on 5/21/18.
 */
public class MStudents {
    public static void main(String[] args) {
        LinkedHashSet<Students> stud = new LinkedHashSet();
        stud.add(new Students(10,"AG"));
        stud.add(new Students(20,"AC"));
        stud.add(new Students(0,"AB"));
        stud.add(new Students(30,"AB"));
        //stud.add(new Student());

        for(Students st:stud){
            System.out.println("Id:"+st.id+"Name:"+st.name);

        }

    }
}
