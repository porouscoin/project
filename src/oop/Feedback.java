package oop;

public abstract class Feedback {
    private int feedbackID;
    private int rating;
    private String review;
    private int userID;

    public Feedback(int feedbackID, int rating, int userID, String review) {
        this.feedbackID = feedbackID;
        this.rating = rating;
        this.userID = userID;
        this.review = review;
    }

    public int getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(int feedbackID) {
        this.feedbackID = feedbackID;
    }

    public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public abstract void saveFeedback();
}