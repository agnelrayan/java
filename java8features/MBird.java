package com.expertzlab.java8features;

public class MBird {
    public static void main(String[] args) {
        final String color = "White";

       /* Drawable d2=()->{
            System.out.println("Drawing "+width);
        };*/
        Bird b = (name) -> {
            //System.out.println("Color:" + color);
            return "Welcome Mr:"+name;
        };

        System.out.println(b.fly("XY"));
    }
}
