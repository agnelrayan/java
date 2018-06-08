package com.expertzlab.Collections.HashMapSample;

import sun.management.FileSystem;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NIOAnswerSheetReader implements AnswerSheetReader {

    String filePath;

    public NIOAnswerSheetReader() {
        super();
    }

    public NIOAnswerSheetReader(String filePath) {
        super();
        this.filePath = filePath;
    }
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    List<String> readLines(){
        List<String> lines = new ArrayList<String>();
        try{
            Charset charset = Charset.forName("US-ASCII");
            Path path= FileSystems.getDefault().getPath(filePath);

            BufferedReader bufferedReader = Files.newBufferedReader(path,charset);
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



    public List<AnswerSheet> readAnswerSheet(){

        List<AnswerSheet> answerSheetList = new ArrayList<AnswerSheet>();
        AnswerSheet answerSheet = new AnswerSheet();
        System.out.println("Inside...");

        Set<Answer> answerSet = new HashSet<Answer>();


        for(String line:readLines()){
            System.out.println("Line"+line);
            //line.split(" ");
            String[] token = line.split(" ");

            answerSet.add(new Answer(token[0],token[1]));
            //answers.add(new Answer(token[0], token[1]));
            //line.split(" ");
            //answerSheetList.add(line);

            answerSheet.setRollNo("123");
            answerSheet.setName("Ag");
            answerSheet.setAnswer(answerSet);
            answerSheetList.add(answerSheet);

        }
        return  answerSheetList;

    }
}
