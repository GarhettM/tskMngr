package com.example.taskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button addTaskButton = MainActivity.this.findViewById(R.id.addTask);
        addTaskButton.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, AddTask.class);
            startActivity(i);
        });

        Button allTasksButton = MainActivity.this.findViewById(R.id.allTasks);
        allTasksButton.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, AllTasks.class);
            startActivity(i);
        });
    }
}