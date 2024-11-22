package oop;
import database.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GuideAndSeek {
    private static GuideAndSeek instance; // Singleton instance
    private List<User> users = new ArrayList<>();
    private List<Feedback> feedbacks = new ArrayList<>();
    private List<DiscussionRoom> discussionRooms = new ArrayList<>();
    private Admin admin;
    private List<Question> questions = new ArrayList<>();
    private DBHandler db = new MySQLDBHandler();

    // Private constructor to prevent instantiation
    private GuideAndSeek() {}

    // Public method to provide the global instance
    public static GuideAndSeek getInstance() {
        if (instance == null) {
            instance = new GuideAndSeek();
        }
        return instance;
    }
    
    public void setDBHandler(DBHandler hnd) {
    	this.db = hnd;
    }
    
    public boolean login(String username, String password) {
        ResultSet rs = null;
        try {
            // Fetch user record from the 'users' table by username
            rs = db.fetch("user", "username", username);

            if (rs != null && rs.next()) {
                // Retrieve the stored password for the given username
                String storedPassword = rs.getString("password");

                // Compare the stored password with the entered password
                if (storedPassword.equals(password)) {
                    // If password matches, login is successful
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // If username doesn't exist or passwords don't match
        return false;
    }

    // Getters and setters
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public List<DiscussionRoom> getDiscussionRooms() {
        return discussionRooms;
    }

    public void setDiscussionRooms(List<DiscussionRoom> discussionRooms) {
        this.discussionRooms = discussionRooms;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
    
    public void addUser(User u) {
    	db.save(u);
    }
    public boolean isUsernameOrEmailTaken(String username, String email) {
        try {
            // Check for duplicate username
            ResultSet usernameResult = db.fetch("user", "username", username);
            if (usernameResult != null && usernameResult.next()) {
                return true; // Username already exists
            }

            // Check for duplicate email
            ResultSet emailResult = db.fetch("user", "email", email);
            if (emailResult != null && emailResult.next()) {
                return true; // Email already exists
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // No duplicate found
    }
}