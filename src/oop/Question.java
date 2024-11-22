package oop;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String questionID;
    private String title;
    private String body;
    private List<Answer> answers = new ArrayList<>();

    public Question(String questionID, String title, String body) {
        this.questionID = questionID;
        this.title = title;
        this.body = body;
    }

    public String getQuestionID() {
        return questionID;
    }

    public void setQuestionID(String questionID) {
        this.questionID = questionID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void addAnswer(String content) {
        Answer answer = new Answer("A-" + (answers.size() + 1), content, this.questionID);
        answers.add(answer);
        System.out.println("Answer added to question: " + title);
    }

    public void saveQuestion() {
        System.out.println("Saving question: " + title);
    }
}