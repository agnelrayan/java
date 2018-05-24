package com.expertzlab.Collections.LinkedHashMapSample;

import java.util.LinkedHashMap;
import java.util.Map;

public class BookLHMMain {
    public static void main(String[] args) {
        BookLHM obj1 = new BookLHM(1,"AB","XY");
        BookLHM obj2 = new BookLHM(2,"CD","IJ");
        BookLHM obj3 = new BookLHM(4,"EF","LM");
        BookLHM obj4 = new BookLHM(3,"EF","LM");

        LinkedHashMap<Integer,BookLHM> map = new LinkedHashMap();
        map.put(1,obj1);
        map.put(3,obj2);
        map.put(2,obj3);
        map.put(4,obj4);

        for(Map.Entry<Integer,BookLHM> entry:map.entrySet()){
           // System.out.println(entry.getKey()+":"+entry.getValue());
            int key = entry.getKey();
            BookLHM value = entry.getValue();

            System.out.println("Get Key:"+key);
            //System.out.println("Get Value:"+value);
            System.out.println("Values:"+"Book Id:"+value.bookId+"Book Name:"+value.bookName+"Book Author"+value.bookAuthor);
        }
    }
}
