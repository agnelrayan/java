package com.expertzlab.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created by geo on 10/10/17.
 */
public class FileScannerEx2 {
    public static void main(String[] args)throws Exception {
        File fw = new File("Agnew.txt");
        Scanner input = new Scanner(fw);
        int i=1;
        while(input.hasNextLine()){
            System.out.println(input.nextLine());
            i++;
        }
    }
}
