package oop;

public class CourseFeedback extends Feedback {
    private String courseID;
    private String courseName;

    public CourseFeedback(String feedbackID, int rating, String courseID, String courseName) {
        super(feedbackID, rating);
        this.courseID = courseID;
        this.courseName = courseName;
    }

    @Override
    public void saveFeedback() {
        System.out.println("Saving Course Feedback for: " + courseName);
    }

    // Getters and setters
    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}