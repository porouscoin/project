package oop;

public class User {
    private String userID;
    private String username;
    private String email;
    private String password;
    private String name;
    private String bio;
    private String profilePic;
    private String contactInfo;

    public User(String userID, String username, String email, String password, String name, String bio, String profilePic, String contactInfo) {
        this.userID = userID;
        this.username = username;
        this.email = email;
        this.password = password;
        this.name = name;
        this.bio = null;
        this.profilePic = null;
        this.contactInfo = contactInfo;
    }
    
    public Boolean login(String username, String password) {
    	
    	return true;
    }
    // Getters and setters
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}