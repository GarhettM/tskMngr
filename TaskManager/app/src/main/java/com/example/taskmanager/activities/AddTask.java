package com.example.taskmanager.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.taskmanager.R;
import com.example.taskmanager.daos.TaskDatabase;
import com.example.taskmanager.models.TaskItem;

public class AddTask extends AppCompatActivity {

    TaskDatabase taskDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        taskDatabase = Room.databaseBuilder(getApplicationContext(), TaskDatabase.class, "task_database")
                .allowMainThreadQueries()
                .build();

        Button submitTaskButton = AddTask.this.findViewById(R.id.submitTaskButton);
        submitTaskButton.setOnClickListener(v -> {


            try {
                Context context = getApplicationContext();
                CharSequence text = "Submitted!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, text, duration).show();
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            String task = ((EditText)findViewById(R.id.editTask)).getText().toString();
            String dueDate = ((EditText)findViewById(R.id.editTextDate)).getText().toString();
            String taskDesc = ((EditText)findViewById(R.id.editTaskDescription)).getText().toString();

            TaskItem taskItem = new TaskItem(task, dueDate, taskDesc);
            taskDatabase.taskDao().insert(taskItem);

            Intent i = new Intent(AddTask.this, MainActivity.class);
//            i.putExtra("task", task);
//            i.putExtra("dueDate", dueDate);
//            i.putExtra("taskDesc", taskDesc);

            startActivity(i);
        });
    }
}