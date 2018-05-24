package com.expertzlab.Collections.comparableex;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by agnel on 5/22/18.
 */
public class MovieM {
    public static void main(String[] args) {
        ArrayList<Movie> al = new ArrayList();

        Movie m1 = new Movie(10,"I",2016);
        Movie m2 = new Movie(8,"E",2017);
        Movie m3 = new Movie(9,"J",2018);

        al.add(m1);
        al.add(m2);
        al.add(m3);


        Collections.sort(al);

        for(Movie m:al){
            System.out.println(" Rating: "+m.getRating()+" Name: "+m.getName()+" Year: "+m.getYear());
        }
    }
}
