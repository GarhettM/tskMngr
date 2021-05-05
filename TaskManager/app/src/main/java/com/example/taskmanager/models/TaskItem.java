package com.example.taskmanager.models;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class TaskItem {
    @PrimaryKey(autoGenerate = true)
    public long id;
    public String name;
    public String dueDate;
    public String desc;
    public boolean status = false;

    public TaskItem(String name, String dueDate, String desc) {
        this.name = name;
        this.dueDate = dueDate;
        this.desc = desc;
    }
}
