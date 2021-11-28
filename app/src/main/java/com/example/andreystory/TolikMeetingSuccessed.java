package com.example.andreystory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TolikMeetingSuccessed extends AppCompatActivity {
    Button resume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tolik_meeting_successed);

        resume = findViewById(R.id.resume);
        resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent guard_meeting = new Intent(TolikMeetingSuccessed.this,
                        GuardMeeting.class);
                startActivity(guard_meeting);
                finish();
            }
        });
    }
}