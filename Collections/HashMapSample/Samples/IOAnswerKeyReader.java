package com.expertzlab.Collections.HashMapSample.Samples;

import com.expertzlab.Collections.HashMapSample.Answer;
import com.expertzlab.examples.AnswerKey;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IOAnswerKeyReader {

    public IOAnswerKeyReader() {
    }

    public List <String> readlines() {

        List<String> lines = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("answerkey.txt"));
           /* Charset charset = Charset.forName("US-ASCII");
            //Path path = FileSystems.getDefault().getPath(filePath);
            Path path = Paths.get(filePath);
            BufferedReader bufferedReader = Files.newBufferedReader(path,
                    charset);*/
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                lines.add(line);
            }
        }catch (Exception e){
            e.printStackTrace();


        }
        return lines;
    }

    public Map<String, Answers> readAnswerKeyMap() {
        System.out.println("inside...");
        Map<String,Answers> answerKeyMap= new HashMap<String, Answers>();
        for (String line : readlines()){
            System.out.println("line ->>"+line);
            String [] token =line.split(" ");
            answerKeyMap.put ( token[0] ,  new Answers(token[0], token[1], Integer.parseInt( token[2])));
        }
        return answerKeyMap;
    }


    public static void main(String[] args) {
        IOAnswerKeyReader obj =new IOAnswerKeyReader();
        obj.readAnswerKeyMap();
        obj.readlines();

    }

    /*public static void main(String[] args) throws Exception{
        Map<String, AnswerKey> keyMap = readAnswerKeyMap();
        BufferedReader reader = new BufferedReader(new FileReader("answerkey.txt"));
        String line;
        while((line=reader.readLine())!=null){
            //String[] x = str.split(" ");
            //list.add(Integer.parseInt(x[0]),Integer.parseInt(x[1]),Integer.parseInt(x[2]));
            keyMap.put("1",new AnswerKey(line));
            keyMap.put("2",new AnswerKey(line));
            keyMap.put("3",new AnswerKey(line));
        }
       //System.out.println(keyMap);
        for(Map.Entry entry:keyMap.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }*/




}
