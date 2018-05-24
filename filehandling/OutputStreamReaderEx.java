package com.expertzlab.filehandling;

import java.io.*;

/**
 * Created by geo on 11/10/17.
 */
public class OutputStreamReaderEx {
    String name;
    int id;

    public static void main(String[] args) throws Exception{
        OutputStream out = new FileOutputStream("ag23.txt");
        //OutputStreamWriter writer = new OutputStreamWriter(out);
        ObjectOutputStream object = new ObjectOutputStream(out);
        OutputStreamReaderEx obj = new OutputStreamReaderEx();
        obj.id=10;
        obj.name="Ag";

        object.writeObject(obj);

    }
}
