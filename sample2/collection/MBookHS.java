package com.expertzlab.sample2.collection;

import java.util.HashSet;

/**
 * Created by agnel on 5/21/18.
 */
public class MBookHS {
    public static void main(String[] args) {
        HashSet<BookHS> book = new HashSet();
        book.add(new BookHS(1,"Dennis Ritchie","C"));
        book.add(new BookHS(2,"Strous Bjerne","C++"));
        book.add(new BookHS(4,"Hadoop in Practise","Alex"));
        book.add(new BookHS(3,"James Gosling","Java"));
        book.add(new BookHS(3,"James Gosling","Java"));


        for(BookHS books:book){
            System.out.println("Id:"+books.id+"Author Name:"+books.author+"Book Name:"+books.bookname);
        }

    }
}
