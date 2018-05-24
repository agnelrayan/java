package com.expertzlab.ExceptionHandlingEx;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

/**
 * Created by geo on 31/1/18.
 */
public class Demo5 {
    public static void main(String[] args) throws Exception{
        try {
            LineNumberReader lineReader = new LineNumberReader(new FileReader("ag.txt"));
            String line = lineReader.readLine();
            lineReader.close();

            System.out.println(line);

        }
        // catch (FileNotFoundException | IOException ex)
        catch (FileNotFoundException ex) {
            System.err.println("File not found");
        }
    }
}