package com.expertzlab.sample3;

import java.util.*;

/**
 * Created by agnel on 5/16/18.
 */
public class StringShuffle {
    public static void main(String[] args) {
        String[] str={"ag","ray","joy","prince"};

        List<String> al = Arrays.asList(str);
        Collections.shuffle(al);

        for(String obj:al)
            System.out.println(obj);
    }


}
