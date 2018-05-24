package com.expertzlab.sample2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by agnel on 5/9/18.
 */
public class DateFormatEx {
    public static void main(String[] args) {
        Date date  = new Date();
        System.out.println(date);

        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(fm.format(date));
    }
}
