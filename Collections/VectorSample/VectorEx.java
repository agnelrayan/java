package com.expertzlab.Collections.VectorSample;

import javax.swing.text.Element;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/**
 * Created by Agnel on 17/10/17.
 */
public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> li = new Vector();

        li.add(10);
        li.addElement(30);
        li.addElement(20);


        Enumeration e = li.elements();

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }

}
