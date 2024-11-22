package oop;

public class Answer {
    private String answerID;
    private String content;
    private String questionID;

    public Answer(String answerID, String content, String questionID) {
        this.answerID = answerID;
        this.content = content;
        this.questionID = questionID;
    }

    public String getAnswerID() {
        return answerID;
    }

    public void setAnswerID(String answerID) {
        this.answerID = answerID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getQuestionID() {
        return questionID;
    }

    public void setQuestionID(String questionID) {
        this.questionID = questionID;
    }

    public void saveAnswer() {
        System.out.println("Saving answer: " + content);
    }
}