package com.example.taskmanager.daos;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.taskmanager.models.TaskItem;

@Database(entities = {TaskItem.class}, version=1)
public abstract class TaskDatabase extends RoomDatabase {
    public abstract TaskDao taskDao();
}
