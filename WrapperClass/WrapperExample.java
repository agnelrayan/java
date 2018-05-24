package com.expertzlab.WrapperClass;

public class WrapperExample{
    public static void main(String args[]){
        //Converting int into Integer
      /*  int a=20;
        Integer i=Integer.valueOf(a);//converting int into Integer
        Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally

        System.out.println(a+" "+i+" "+j);

        Integer b=a;

       int bb=j.intValue();
        System.out.println(bb);*/

        int k=30;
        Integer kk = k;
        System.out.println(kk);

        int j = 300;
        Integer jj = Integer.valueOf(j);
        System.out.println(jj);

        Integer jk =400;
        int ki = jk.intValue();
        int kii=ki;
        System.out.println(ki);
        System.out.println(kii);

        float f = (float)45.50;

        int i3=90;

        Integer i2 = Integer.valueOf(i3);
        System.out.println("I2:"+i2);

        Integer i4=i3;
        System.out.println("I4:"+i4);

        float f2=98.90f;
        Float f3 = f2;
        System.out.println("F3"+f3);

        Float f4 = Float.valueOf(f2);
        System.out.println("F4"+f4);

    }
}