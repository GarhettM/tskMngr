package com.example.taskmanager.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.taskmanager.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent intent = getIntent();
//
//        String username = intent.getExtras().getString("name");
//        TextView tv = MainActivity.this.findViewById(R.id.name);
//        if(username != null) {
//            tv.setText(username);
//        }


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

        ImageButton addSettingsButton = MainActivity.this.findViewById(R.id.settingsButton);
        addSettingsButton.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, Settings.class);
            startActivity(i);
        });
    }
}