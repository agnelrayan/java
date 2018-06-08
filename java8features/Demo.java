package com.expertzlab.java8features;

/**
 * Without Lambda Expression
 *
 */

    interface Drawable{
        public void draw();
    }
    public class Demo {
        public static void main(String[] args) {
            final int width=10;

            //without lambda, Drawable implementation using anonymous class
            Drawable d=new Drawable(){
                public void draw(){System.out.println("Drawing "+width);}
            };
            d.draw();
        }
    }

