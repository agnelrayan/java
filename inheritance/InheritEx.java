package com.expertzlab.inheritance;

/**
 * Created by agnel on 4/5/18.
 */


class Parents {
    String color = "White";

    void talk() {
        System.out.println("From Parent....");
        System.out.println("Color of Parent:"+color);
    }
    void walk(int weight){
        System.out.println("From Parent...Walk Method..");
        System.out.println("Weight:"+weight);


    }

}

class Children extends Parents{
        int height=176;
        public void walk(float weight){
            System.out.println("From Child...Walk Method..");
            System.out.println("Height:"+height);
            System.out.println("Weight:"+weight);
        }
}



public class InheritEx {
    public static void main(String[] args) {

        Parents obj = new Children();
        obj.talk();
        obj.walk(90);

        Parents obj2 = new Parents();
        obj2.walk(80);

    }
}
