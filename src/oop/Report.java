package oop;

public class Report extends Request {
    private String reason;
    private String username;

    public Report(String requestID, boolean status, String reason, String username) {
        super(requestID, status);
        this.reason = reason;
        this.username = username;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void saveRequest() {
        System.out.println("Saving Report for user: " + username + " with reason: " + reason);
    }
}