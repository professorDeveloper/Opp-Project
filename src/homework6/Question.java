package homework6;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> homework6
 * Class Name ->
 * Copyright © : 8/29/2022
 */
public class Question {
    private String question;
    private String answer;


    Question(String newQuestion , String newAnswer){
        this.question = newQuestion;
        this.answer = newAnswer;

    }

    public boolean isTrue(String isAnswer) {
        return this.answer.equals(isAnswer);
    }

    public String getQuestion() {
        return question;
    }
}
