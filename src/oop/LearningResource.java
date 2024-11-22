package oop;

public class LearningResource extends Request {
    private String subject;
    private String link;

    public LearningResource(String requestID, boolean status, String subject, String link) {
        super(requestID, status);
        this.subject = subject;
        this.link = link;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public void saveRequest() {
        System.out.println("Saving Learning Resource Request: " + subject);
    }
}