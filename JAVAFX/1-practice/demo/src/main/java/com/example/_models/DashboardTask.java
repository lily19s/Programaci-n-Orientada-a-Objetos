package com.example._models;

import java.util.Date;

import com.example._enums.Priority;
import com.example._enums.Status;

public class DashboardTask {

    private String title;
    private String description;
    private Date date;
    private int userID;
    private int categoryID;
    private Priority priority;
    private Status status;

    //constructor
    public DashboardTask(String title, String description, Date date, int userID, int categoryID, Priority priority, Status status) {
        this.categoryID = categoryID;
        this.date = date;
        this.description = description;
        this.priority = priority;
        this.title = title;
        this.userID = userID;
        this.status = status;
    }

    public DashboardTask(String title, String description, Date date, Priority priority) {
        this(title, description, date, 0, 0, priority, Status.TODO);
    }
    
    //getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String text = ""
                + "title='" + getTitle() + "\n"
                + ", description='" + getDescription() + "\n"
                + ", date=" + getDate() + "\n"
                + ", userID=" + getUserID() + "\n"
                + ", categoryID=" + getCategoryID() + "\n"
                + ", priority=" + getPriority() + "\n";
        return text;
    }

}
