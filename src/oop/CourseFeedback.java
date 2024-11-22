package oop;

public class CourseFeedback extends Feedback {
    private int courseID;
    private String courseName;

    public CourseFeedback(int feedbackID, int rating, int courseID, String courseName, int userID, String review) {
        super(feedbackID, rating, userID, review);
        this.courseID = courseID;
        this.courseName = courseName;
    }

    @Override
    public void saveFeedback() {
        System.out.println("Saving Course Feedback for: " + courseName);
    }

    // Getters and setters
    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}