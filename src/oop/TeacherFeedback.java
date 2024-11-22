package oop;

public class TeacherFeedback extends Feedback {
    private int teacherID;
    private String teacherName;

    public TeacherFeedback(int feedbackID, int rating, int teacherID, String teacherName, int userID, String review) {
        super(feedbackID, rating, userID, review);
        this.teacherID = teacherID;
        this.teacherName = teacherName;
    }

    @Override
    public void saveFeedback() {
        System.out.println("Saving Teacher Feedback for: " + teacherName);
    }

    // Getters and setters
    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}