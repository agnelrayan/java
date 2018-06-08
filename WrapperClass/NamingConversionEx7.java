package com.expertzlab.WrapperClass;




public class NamingConversionEx7 {
    public static void main(String[] args) {
        String str="123";
        int i = Integer.parseInt(str);
        System.out.println("Integer Value:"+(i+100));//223

      /*  double d = Double.parseDouble(str);
        System.out.println(d);*/

        int i2 = 25;
        String str2 = String.valueOf(i2);
        System.out.println("The string value:"+(str2+200));//25200

        String str3 = Integer.toString(i2);
        System.out.println("The value String:"+str3);

         Integer i3 = new Integer(90);
        float f = i3.floatValue();
        System.out.println(f);

        double d3 = i3.doubleValue();
        System.out.println("Double value:"+d3);





    }
}
