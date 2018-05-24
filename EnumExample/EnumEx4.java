package com.expertzlab.EnumExample;
//enum Season{Spring,Winter,Summer,FALL}
public class EnumEx4 {

    //enum Season{Spring,Winter,Summer,FALL};

    enum Season {

        Spring(10), Winter(20), Summer(30), Fall(40);
        private int value;

        private Season(int value) {
            this.value = value;
        }
    }


    public static void main(String[] args) {
        for(Season s:Season.values()){

            //System.out.println(s);
             //System.out.println("Season:"+s+"-"+"Values:"+s.value);
            System.out.println(s +":" +s.value);
        }

        //Season s = Season.FALL;
       // System.out.println(s);

    }
}
