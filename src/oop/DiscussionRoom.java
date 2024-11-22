package oop;

import java.util.ArrayList;
import java.util.List;

public class DiscussionRoom {
    private String roomID;
    private String name;
    private String description;
    private String topic;
    private List<User> users = new ArrayList<>();

    public DiscussionRoom(String roomID, String name, String description, String topic) {
        this.roomID = roomID;
        this.name = name;
        this.description = description;
        this.topic = topic;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public List<User> getUsers() {
        return users;
    }

    public void addParticipant(User user) {
        this.users.add(user);
        System.out.println(user.getUsername() + " has joined the discussion room: " + name);
    }

    public void saveDiscussionRoom() {
        System.out.println("Saving discussion room: " + name);
    }
}