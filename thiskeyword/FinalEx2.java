package com.expertzlab.thiskeyword;



public class FinalEx2 {
    public final int id;//bfv
   final static String name;//sbfv

    static{name="Ag";}

    public FinalEx2() {
        id = 20;
    }

    public void display(){
        //id=20;
        System.out.println(id);
        System.out.println(name);
    }

    final void message(){
        System.out.println("In Message..");
    }

    public static void main(String[] args) {
        FinalEx2 obj = new FinalEx2();
        obj.display();

    }
}

class FinalDemo extends FinalEx2{
    void messag(){

    }

}
