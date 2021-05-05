package com.example.taskmanager.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.taskmanager.R;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button settingsSubmitButton = Settings.this.findViewById(R.id.settingsSubmitButton);
            settingsSubmitButton.setOnClickListener(v -> {
                String name = ((EditText)findViewById(R.id.settingsName)).getText().toString();
                Context context = getApplicationContext();
                CharSequence text = "Submitted!";
                int duration = Toast.LENGTH_SHORT;

                Toast.makeText(context, text, duration).show();

                try {
                    Thread.sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent i = new Intent(Settings.this, MainActivity.class);
                i.putExtra("name", name);
                startActivity(i);
            });

    }


}