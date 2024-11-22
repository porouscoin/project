package oop;

public class TeacherFeedback extends Feedback {
    private String teacherID;
    private String teacherName;

    public TeacherFeedback(String feedbackID, int rating, String teacherID, String teacherName) {
        super(feedbackID, rating);
        this.teacherID = teacherID;
        this.teacherName = teacherName;
    }

    @Override
    public void saveFeedback() {
        System.out.println("Saving Teacher Feedback for: " + teacherName);
    }

    // Getters and setters
    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}