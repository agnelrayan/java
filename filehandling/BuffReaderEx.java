package com.expertzlab.filehandling;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class BuffReaderEx {
    public static void main(String[] args) throws Exception {


        Path filePath = FileSystems.getDefault().getPath(".", "abc125.txt");
        InputStream inputStream = Files.newInputStream(filePath);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}