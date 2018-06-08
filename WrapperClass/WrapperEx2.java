package com.expertzlab.WrapperClass;

/**
 * Created by geo on 4/10/17.
 */
public class WrapperEx2 {
    void display(){

    }
    public void main(String[] args) {
        Integer i = new Integer(90);
        float f = i.floatValue();
        System.out.println(f);

        double d = i.doubleValue();
        System.out.println(d);

        short s = i.shortValue();
        System.out.println("S:"+s);

        Float f2 = new Float(50);
        int i2 = f2.intValue();
        System.out.println(i2);


        double d2 = f2.doubleValue();
        System.out.println("D2:"+d2);

        long l2 = f2.longValue();
        System.out.println("L2"+l2);

        int i3=20;
        Integer i4 =Integer.valueOf(i3);//autoboxing
        Integer i5 = i3;

        Integer i6 = new Integer(10);
        int i7 =i6.intValue();//unboxing




    }
}
