package com.expertzlab.Collections.HashMapSample;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class IOAnswerKeyReader implements AnswerKeyReader {
    public Map<String, Answer> readAnswerKeyMap() {
       List<String> lines = new ArrayList();
        try{
            BufferedReader reader = new BufferedReader(new FileReader("answerkey/answerkey.txt"));
           String line;
            while((line=reader.readLine())!=null){
                lines.add(line);
            }
            System.out.println(lines);
        }

        catch(Exception e){
            System.out.println(e);
        }

        return null;
    }
}
