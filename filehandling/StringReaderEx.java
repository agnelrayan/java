package com.expertzlab.filehandling;

import java.io.StringReader;

/**
 * Created by geo on 9/10/17.
 */
public class StringReaderEx {
    public static void main(String[] args)throws Exception {
        String str ="Welcome to String Reader Ex";
        StringReader sr = new StringReader(str);
        int i=0;
        while((i=sr.read())!=-1)
        {
            System.out.println((char)i);
        }

    }
}
