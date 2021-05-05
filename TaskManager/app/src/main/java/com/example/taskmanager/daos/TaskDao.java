package com.example.taskmanager.daos;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.taskmanager.models.TaskItem;

import java.util.List;

@Dao
public interface TaskDao {

    @Insert
    public void insert(TaskItem taskItem);

    @Query("SELECT * FROM TaskItem")
    public List<TaskItem> findAll();

//    @Query("SELECT * FROM TaskItem ORDER BY id DESC")
//    public List<TaskItem> find
}
