package oop;

public class Admin {
    private String adminID;
    private String username;
    private String email;
    private String password;

    public Admin(String adminID, String username, String email, String password) {
        this.adminID = adminID;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Getters and setters
    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}