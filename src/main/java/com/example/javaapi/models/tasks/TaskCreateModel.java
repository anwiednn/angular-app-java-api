package com.example.javaapi.models.tasks;

import java.util.Date;

public class TaskCreateModel {
    public final int userId;
    public final String name;
    public final String notes;
    public final Date reminderDate;

    public TaskCreateModel(int userId, String name, String notes, Date reminderDate) {
        this.userId = userId;
        this.name = name;
        this.notes = notes;
        this.reminderDate = reminderDate;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getNotes() {
        return notes;
    }

    public Date getReminderDate() {
        return reminderDate;
    }
}