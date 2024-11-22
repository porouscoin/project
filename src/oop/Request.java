package oop;

public abstract class Request {
    private String requestID;
    private boolean status;

    public Request(String requestID, boolean status) {
        this.requestID = requestID;
        this.status = status;
    }

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public abstract void saveRequest();

    public void updateRequest(boolean status) {
        this.status = status;
        System.out.println("Request " + requestID + " status updated to: " + status);
    }
}