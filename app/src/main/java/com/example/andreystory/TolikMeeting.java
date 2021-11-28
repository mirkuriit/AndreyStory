package com.example.andreystory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TolikMeeting extends AppCompatActivity {
    Button drink_with_Letov, dont_drink_with_Letov;
    TextView intelligence, brave, luck;
    private boolean isYouReady(){
        if (BytulkaMeeting.brave_characteristics - BytulkaMeeting.intelligence_characteristics > 0){
            return true;
        }
        else
            return false;
    }
    private void findAllCharacteristics(){
        intelligence = findViewById(R.id.intelligence);
        brave = findViewById(R.id.brave);
        luck = findViewById(R.id.luck);
    }

    private void setAllCharacteristics(){
        intelligence.setText(Integer.valueOf(BytulkaMeeting.intelligence_characteristics).toString());
        brave.setText(Integer.valueOf(BytulkaMeeting.brave_characteristics).toString());
        luck.setText(Integer.valueOf(BytulkaMeeting.luck_characteristics).toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tolik_meeting);
        findAllCharacteristics();
        setAllCharacteristics();

        drink_with_Letov = findViewById(R.id.drink_with_Letov);
        dont_drink_with_Letov = findViewById(R.id.dont_drink_with_Letov);

        drink_with_Letov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isYouReady()){
                    BytulkaMeeting.brave_characteristics++;
                    Intent success_drink_with_Letov = new Intent(TolikMeeting.this,
                            TolikMeetingSuccessed.class);
                    startActivity(success_drink_with_Letov);
                    finish();
                }
                else {
                    Intent failed_drink_with_Letov = new Intent(TolikMeeting.this,
                            TolikMeetingFailed.class);
                    startActivity(failed_drink_with_Letov);
                    finish();
                }

            }
        });

        dont_drink_with_Letov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BytulkaMeeting.intelligence_characteristics += 3;
                Intent success_dodge_Letov = new Intent(TolikMeeting.this,
                        TolikMeetingSuccessedDodge.class);
                startActivity(success_dodge_Letov);
                finish();
            }
        });


    }
}