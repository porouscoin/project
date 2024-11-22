package oop;

public class Announcement extends Request {
    private String text;

    public Announcement(String requestID, boolean status, String text) {
        super(requestID, status);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void saveRequest() {
        System.out.println("Saving Announcement: " + text);
    }
}