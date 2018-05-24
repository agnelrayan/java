package com.expertzlab.filehandling;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by geo on 9/10/17.
 */
public class ScannerRead {
    public static void main(String[] args) throws Exception{
       // Path path = Paths.get("ag2.txt");

        File file = new File("agn5.txt");

        Scanner scanner = new Scanner(file);

       // Scanner scanner = new Scanner(path);

        //String line;a
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }

    }
}
