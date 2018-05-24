package com.expertzlab.Collections.HashMapSample;


import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NIOAnswerKeyReader implements AnswerKeyReader {

    String filePath;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }


    public NIOAnswerKeyReader() {
        super();
    }

    public NIOAnswerKeyReader(String filePath) {
        super();
        this.filePath = filePath;
    }

    public Map<String ,Answer> readAnswerKeyMap(){
        System.out.println("Inside");
        Map<String,Answer> answerMap = new HashMap<String, Answer>();
        for(String line:readLines()){
            System.out.println("Line-->"+line);
            String[] token = line.split(" ");
            answerMap.put(token[0],new Answer(token[0],token[1],Integer.parseInt(token[2])));
        }
        return answerMap;

    }

    List<String> readLines(){

        List<String> lines= new ArrayList<String>();
        try{

            Charset charSet = Charset.forName("US-ASCII");
            Path path = Paths.get(filePath);

            BufferedReader bufferedReader = Files.newBufferedReader(path,charSet);
            String line=null;

            while((line=bufferedReader.readLine())!=null){
                lines.add(line);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return lines;
    }

}
