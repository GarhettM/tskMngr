package com.example.taskmanager.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.taskmanager.R;
import com.example.taskmanager.adapters.AllTaskRecyclerViewAdapter;
import com.example.taskmanager.daos.TaskDao;
import com.example.taskmanager.daos.TaskDatabase;
import com.example.taskmanager.models.TaskItem;

import java.util.ArrayList;
import java.util.List;

public class AllTasks extends AppCompatActivity implements AllTaskRecyclerViewAdapter.TaskListener {
    public static String TAG = "taskmgr.allTasks";
    TaskDatabase taskDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_tasks);
        taskDatabase = Room.databaseBuilder(getApplicationContext(), TaskDatabase.class, "task_database")
                .allowMainThreadQueries()
                .build();

        ArrayList<TaskItem> taskItems = (ArrayList<TaskItem>)taskDatabase.taskDao().findAll();
        Log.i(TAG, "  :  " + taskItems.get(0).name);
        RecyclerView recyclerView = findViewById(R.id.allTasks);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(new AllTaskRecyclerViewAdapter(taskItems, this));


    }

    @Override
    public void listener(TaskItem taskItem) {

    }
}