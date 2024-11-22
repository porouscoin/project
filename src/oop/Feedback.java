package oop;

public abstract class Feedback {
    private String feedbackID;
    private int rating;

    public Feedback(String feedbackID, int rating) {
        this.feedbackID = feedbackID;
        this.rating = rating;
    }

    public String getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(String feedbackID) {
        this.feedbackID = feedbackID;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public abstract void saveFeedback();
}