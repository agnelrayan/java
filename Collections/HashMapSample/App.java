package com.expertzlab.Collections.HashMapSample;

import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {


        NIOAnswerKeyReader answerKeyReader = new NIOAnswerKeyReader() ;
        answerKeyReader.setFilePath("a123.txt");
        Map<String,Answer> answerMap = answerKeyReader.readAnswerKeyMap();
        System.out.println(answerMap);

        NIOAnswerSheetReader answerSheetReader = new NIOAnswerSheetReader();
        answerSheetReader.setFilePath("a456.txt");
        System.out.println(answerSheetReader);

        //AnswerSheetReader answerSheetReader=null;
        //AnswerKeyReader answerKeyReader=null;

        AnswerSheetProcessorImpl processor = new AnswerSheetProcessorImpl();
        processor.setAnswerSheetReader(answerSheetReader);
        processor.setAnswerKeyReader(answerKeyReader);


        List<EvaluationInfo> evaluationInfoList  = processor.evaluateAnswerSheet();
        System.out.println(evaluationInfoList);
    }
}
