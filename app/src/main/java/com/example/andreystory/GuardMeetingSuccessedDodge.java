package com.example.andreystory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GuardMeetingSuccessedDodge extends AppCompatActivity {
    Button resume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guard_meeting_successed_dodge);

        resume = findViewById(R.id.resume);
        resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent selection_of_bread = new Intent(GuardMeetingSuccessedDodge.this,
                        SelectionOfBread.class);
                startActivity(selection_of_bread);
                finish();
            }
        });
    }
}