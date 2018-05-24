package com.expertzlab.EnumExample;

public class EnumTest1  {

    enum Season {

        winter(5), summer(10), spring(20);

        private int value;

        private Season(int value) {
            this.value = value;
        }





        }






    public static void main(String[] args) {


                B obj2 = new B();
        obj2.display();

        for(Season s: Season.values())
            System.out.println("s:"+s.value);
    }

}

class B{
public void display(){
  System.out.println("Display");
}
}