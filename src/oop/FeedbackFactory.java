package oop;

public class FeedbackFactory {
    public static Feedback createFeedback(String type, int rating, int id, String name, int userID, String review) {
        if ("Teacher".equalsIgnoreCase(type)) {
            return new TeacherFeedback(id, rating, id, name, userID, review);
        } else if ("Course".equalsIgnoreCase(type)) {
            return new CourseFeedback(id, rating, id, name, userID, review);
        }
        throw new IllegalArgumentException("Invalid feedback type: " + type);
    }
}