package com.expertzlab.Collections.HashMapSample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class AnswerSheetProcessorImpl implements AnswerSheetProcessor {

    AnswerKeyReader answerKeyReader;
    AnswerSheetReader answerSheetReader;
    public AnswerKeyReader getAnswerKeyReader() {
        return answerKeyReader;
    }

    public void setAnswerKeyReader(AnswerKeyReader answerKeyReader) {
        this.answerKeyReader = answerKeyReader;
    }



    public AnswerSheetReader getAnswerSheetReader() {
        return answerSheetReader;
    }

    public void setAnswerSheetReader(AnswerSheetReader answerSheetReader) {
        this.answerSheetReader = answerSheetReader;
    }



    public List<EvaluationInfo> evaluateAnswerSheet(){

        List<EvaluationInfo> evaluationInfoList = new ArrayList<EvaluationInfo>();
        Map<String,Answer> answerMap = answerKeyReader.readAnswerKeyMap();
        List<AnswerSheet> answerSheetMap = answerSheetReader.readAnswerSheet();

        System.out.println("AnswerMap-->"+answerMap);
        System.out.println("AnswerSheetMap"+answerSheetMap);

        for(AnswerSheet answerSheet:answerSheetMap){
            int totalMark=0;

            Set<Answer> answerSet = answerSheet.getAnswer();
            for(Answer answer:answerSet){
                Answer correctAnswer=answerMap.get(answer.getQuestionNumber());
                if(correctAnswer!=null&&correctAnswer.getAnswer().equals(answer.getAnswer()));
                totalMark=totalMark+correctAnswer.getMark();
            }

            EvaluationInfo evaluationInfo = new EvaluationInfo();
            evaluationInfo.setName(answerSheet.getName());
            evaluationInfo.setRollNo(answerSheet.getRollNo());
            evaluationInfo.setTotalMark(totalMark);
            evaluationInfoList.add(evaluationInfo);





        }

        return  evaluationInfoList;

    }
}
