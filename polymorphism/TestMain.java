package com.expertzlab.polymorphism;

class TestOverloading4{
    public static void main(String[] args){
        System.out.println("main with String[]");
    }
    public static void main(String arg){
        System.out.println("main with String");
    }
    public static void main(){
        System.out.println("main without args");
    }
    public static void main(int arg){
        System.out.println("main with String");
    }
}