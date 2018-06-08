package com.expertzlab.thiskeyword;

/**
 * Created by agnel on 5/25/18.
 */
public class SuperEx2 {
    int bookId=101;
    String author="James";
    String bookName="Java";

    SuperEx2(){
        System.out.println("Default Constructor...");
    }

    SuperEx2(int bookId,String bookName,String author){
        this.bookId=bookId;
        this.bookName=bookName;
        this.author=author;


    }
    public void display(){
        System.out.println("Book Id:"+bookId);
        System.out.println("Book Author:"+author);
        System.out.println("Book Name:"+bookName);
    }

    public void message(){
        System.out.println("Message in Parent Class..");
    }

}
