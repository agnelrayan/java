package com.expertzlab.thiskeyword;

/**
 * Created by agnel on 5/23/18.
 */
public class Book {
    int bookId;
    String bookName;
    String author;

    Book(int  id,String name,String au){
        //this();

        bookId=id;
        bookName=name;
        author=au;

    }

    Book(){
        this(20,"Java","James");
        System.out.println("In Default Constructor...");
    }

    void display(){
        this.message();
      //  System.out.println("Return Current Class Reference:"+this);
        System.out.println("Book Id:"+bookId);
        System.out.println("Author:"+author);
        System.out.println("Book Name:"+bookName);
    }

    void message(){
        System.out.println("In Message Body...");
    }

    public static void main(String[] args) {
       // Book b = new Book(10,"C","Dennis");
        Book b = new Book();
        b.display();
      //  System.out.println("Return the Reference of Object:"+b);
    }

}
