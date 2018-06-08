package com.expertzlab.sample2.collection;



import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Hashtable;

/**
 * Created by agnel on 5/22/18.
 */
public class HashMapEx {
    public static void main(String[] args) {
        Hashtable<String,Long> map = new Hashtable();
        map.put("Ab",9090909090l);
        map.put("xy",9804343434l);
        map.put("Ij",9833434343l);
        map.put("Lm",9733434343l);
       // map.put(null,null);
        map.put("PW",null);
        map.put("xy",9098989898l);

        for(Map.Entry itr:map.entrySet()){
            System.out.println("Get Value: "+itr.getKey()+"Get Key: "+itr.getValue());
        }
    }
}
