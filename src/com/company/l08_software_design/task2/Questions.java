package com.company.l08_software_design.task2;

public class Questions {

    private String question;
    private String answer;
    private String rightAnswer;

    public Questions(String question, String wrongAnswer, String rightAnswer){
        this.question = question;
        this.rightAnswer = rightAnswer;
        this.answer = wrongAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }
}
