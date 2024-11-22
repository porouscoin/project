package oop;

import java.util.List;

public class Timetable {
    private String timetableID;
    private List<String> courses;

    public Timetable(String timetableID, List<String> courses) {
        this.timetableID = timetableID;
        this.courses = courses;
    }

    public String getTimetableID() {
        return timetableID;
    }

    public void setTimetableID(String timetableID) {
        this.timetableID = timetableID;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public void saveTimetable() {
        System.out.println("Saving timetable with ID: " + timetableID);
    }
}