package com.expertzlab.sample3;

/**
 * Created by agnel on 5/24/18.
 */
public class StringEx2 {
    public static void main(String[] args) {
        String str="ExpertZLab";
        String str2="ExpertZLab";
        String str5 = new String("ExpertZLab");
        //System.out.println(str.charAt(1));

        StringBuffer str3 = new StringBuffer("ExpertZLab");
        StringBuilder str4 = new StringBuilder("ExpertZLab");

        System.out.println(str.compareTo(str2));//0
        System.out.println(str2.contentEquals(str3));//true
        System.out.println(str2.equals(str3));//false
        System.out.println(str.contentEquals(str4));//true
        System.out.println(str.equals(str4));//false
        System.out.println(str.equals(str5));//true
        System.out.println(str3.equals(str4));//false

        char[] ch={'E','X','P','E','R','T','Z','L','A','B'};
        String str6 = String.copyValueOf(ch);
        String str7 = String.copyValueOf(ch,3,6);
        System.out.println(str6);//EXPERTZLAB
        System.out.println(str7);//EXPERT

        System.out.println(str6.endsWith("LAB"));//true

        byte[] strByte=str6.getBytes();
        System.out.println(strByte);

    }
}
