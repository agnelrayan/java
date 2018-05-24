package com.expertzlab.sample3;

/**
 * Created by agnel on 5/14/18.
 */
public class NamingConverEx {
    public static void main(String[] args) {
        String str ="100";
        int i = Integer.parseInt(str);
        System.out.println(str+100);//100100
        System.out.println(i+100);//200

        String str2 ="100.100";
        float f = Float.parseFloat(str2);
        System.out.println(f+100);
        System.out.println(str2+43.343);

        int i2=300;
        String str3 = String.valueOf(i2);
        String str4=Integer.toString(i2);
        System.out.println(i2+100);//400
        System.out.println(str4+i2);//300300
    }
}
