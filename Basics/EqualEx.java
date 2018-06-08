package com.expertzlab.Basics;

import java.util.HashMap;
import java.util.TreeMap;

public final class EqualEx {
    public static void main(String args[]) {
      /* String s1 = new String("Test");
        String s2 = new String("Test");
        String s3="Test";

        System.out.println("\n1 - PRIMITIVES ");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println("S1 hashcode:"+s1.hashCode());
        System.out.println("S2 hashcoe:"+s2.hashCode());
        System.out.println(s1==s3);//false
        System.out.println("S3 hashcode:"+s3.hashCode());*/

//        String s4=null;
  //      System.out.println(s4.hashCode());
        HashMap<String,Integer> map = new HashMap();
        map.put("aA",1);
        map.put("bc",3);
        map.put(null,4);
        map.put("CD",2);
        map.put("bc",33);

        System.out.println(map);
        System.out.println("Map Hashcode:"+map.hashCode());

    }
}

    /*    A a1 = new A();
        A a2 = new A();

        System.out.println( "\n2 - OBJECT TYPES / STATIC VARIABLE" );
        System.out.println( a1 == a2 ); // false
        System.out.println( a1.s == a2.s ); // true
        System.out.println( a1.s.equals( a2.s ) ); // true

        B b1 = new B();
        B b2 = new B();

        System.out.println( "\n3 - OBJECT TYPES / NON-STATIC VARIABLE" );
        System.out.println( b1 == b2 ); // false
        System.out.println( b1.getS() == b2.getS() ); // false
        System.out.println( b1.getS().equals( b2.getS() ) ); // true
    }
}

final class A
{
    // static
    public static String s;
    A()
    {
        this.s = new String( "ag" );
    }
}

final class B
{
    private String s;
    B()
    {
        this.s = new String( "ag" );
    }

    public String getS()
    {
        return s;
    }

}

*/