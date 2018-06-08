package com.expertzlab.filehandling;

import java.io.File;
import java.util.Scanner;

public class FileScannerEx4 {
    public static void main(String[] args) throws Exception{
        //File file = new File("input.txt");
        Scanner input = new Scanner(new File("input.txt"));
        while(input.hasNext()){
          // System.out.println(input.next());
            String word = input.nextLine();
            System.out.println("Word"+word);
            //System.out.println();
        }

    }
}
