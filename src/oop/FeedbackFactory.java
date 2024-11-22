package oop;

public class FeedbackFactory {
    public static Feedback createFeedback(String type, int rating, String id, String name) {
        if ("Teacher".equalsIgnoreCase(type)) {
            return new TeacherFeedback("FB-" + id, rating, id, name);
        } else if ("Course".equalsIgnoreCase(type)) {
            return new CourseFeedback("FB-" + id, rating, id, name);
        }
        throw new IllegalArgumentException("Invalid feedback type: " + type);
    }
}