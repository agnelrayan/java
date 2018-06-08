package com.expertzlab.Collections.HashSetSample;

import java.util.HashSet;

public class MainBookHashSetEx {
    public static void main(String[] args) {

        BookHashSetEx book1 = new BookHashSetEx(1,"Imitation of Christ","Thomas A Kempis");
        BookHashSetEx book2 = new BookHashSetEx(2,"Confession of St. Augustine","St. Augustine");
        HashSet<BookHashSetEx> book = new HashSet();
        //HashSet<BookHashSetEx> book2 = new HashSet();
        book.add(book1);
        book.add(book2);
        book.add(new BookHashSetEx(4,"Java","James Gosling"));
        book.add(new BookHashSetEx(3,"C++","Bjerne"));
        book.add(new BookHashSetEx(1,"Imitation of Christ","Thomas  A Kempis"));
        book.add(new BookHashSetEx(5,"AA","AA"));
        book.add(new BookHashSetEx(5,"AA","AA"));


        System.out.println("Byeach for loop");
        for(BookHashSetEx b:book){
            System.out.println("Book Id:"+" "+b.bookId+"Book Name:"+b.bookName+"Book Author:"+b.bookAuthor);
        }


       // book.remove(book1);
        System.out.println("After Removing");
        for(BookHashSetEx b:book){
            System.out.println("Book Id:"+" "+b.bookId+"Book Name:"+b.bookName+"Book Author:"+b.bookAuthor);
        }


    }
}
