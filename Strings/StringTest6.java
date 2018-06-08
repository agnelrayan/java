package com.expertzlab.Strings;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by agnel on 3/5/18.
 */
public class StringTest6 {
    public static void main(String[] args) {
        try {
            Date date = new Date();
            // System.out.println(date.toString());
            SimpleDateFormat str = new SimpleDateFormat("E yy.mm.dd hh:mm:ss a zzz");
            System.out.println(str.format(date));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
