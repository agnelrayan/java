package com.expertzlab.filehandling;

import java.io.BufferedReader;
import java.io.CharArrayReader;

/**
 * Created by geo on 9/10/17.
 */
public class CharArrayReaderEx {
    public static void main(String[] args)throws Exception {
        char[] ch={'w','e','l','c','o','m','e'};
        CharArrayReader ca = new CharArrayReader(ch);
        BufferedReader br = new BufferedReader(ca);

        int i=0;
        while((i=br.read())!=-1){
            System.out.print((char)i);
        }
    }
}
