package com.expertzlab.filehandling;

import java.io.File;
import java.util.Scanner;

/**
 * Created by geo on 12/10/17.
 */
public class ScannerFileEx {
    public static void main(String[] args) throws Exception{

        File file =new File("abc123.txt");
        Scanner scanner = new Scanner(file);
        String text = scanner.useDelimiter("\\A").next();
        System.out.println(text);
        scanner.close();
    }
}
