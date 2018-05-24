package com.expertzlab.sample2.collection.hashtable;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by agnel on 5/22/18.
 */
public class BookM {
    public static void main(String[] args) {
        Hashtable<Integer,Book> bt = new Hashtable();
        bt.put(1,new Book(101,"Ag",100));
        bt.put(2,new Book(102,"AB",200));
        bt.put(3,new Book(103,"AC",400));


        for(Map.Entry<Integer,Book> bm: bt.entrySet()){

            int keys = bm.getKey();
            Book values = bm.getValue();

          //  System.out.println("Keys:"+keys);
            System.out.println("Keys:"+keys+"Values:"+"Id:"+values.id+"Name:"+"Author Name:"+values.authorName+"Price:"+values.price);

        }
    }
}
