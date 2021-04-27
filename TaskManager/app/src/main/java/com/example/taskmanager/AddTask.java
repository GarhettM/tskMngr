package com.example.taskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class AddTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        Button submitTaskButton = AddTask.this.findViewById(R.id.submitTaskButton);
        submitTaskButton.setOnClickListener(v -> {
            Context context = getApplicationContext();
            CharSequence text = "Submitted!";
            int duration = Toast.LENGTH_SHORT;

            Toast.makeText(context, text, duration).show();

        });
    }
}