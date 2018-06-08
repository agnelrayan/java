package com.expertzlab.Basics;

/**
 * Created by geo on 21/9/17.
 */
public class Name {

    private String first;
    private String middle;

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setName(String f, String m, String l){
        first=f;
        middle=m;
        last=l;
    }

    private String last;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public Name(String f, String m, String l){
        first=f;
        middle=m;
        last=l;

    }

    public Name(String f, String l){
        first=f;
        middle="";
        last=l;

    }

    public Name(String l){

        first="";
        middle="";
        last=l;

    }

    public String toString(){
        return first + " " +middle+ " " +last;
    }

    public static void main(String[] args) {

        Name myName = new Name("Ag","Ray","Anto");
        Name yourName =new Name("AAA","BBB");

       /*
        Name ourName = new Name("DD");
        System.out.println("MyName:"+myName.toString());
        System.out.println("Your Name:"+yourName.toString());
        System.out.println("Our Name:"+ourName.toString());*/

        System.out.println("MyName First Name:"+myName.getFirst());
        myName.setFirst("Joy");
        System.out.println("My Name First Name:"+myName.toString());

        Name someName = new Name("raya");

        System.out.println("Your Name:"+yourName.getLast());
        yourName.setLast("Sind");
        System.out.println("My LastName:"+yourName.toString());


        someName.setName("AA","BB","CC");
        System.out.println("SomeName:"+someName.toString());

    }
}
