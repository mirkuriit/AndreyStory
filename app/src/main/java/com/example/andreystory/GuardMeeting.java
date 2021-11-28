package com.example.andreystory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GuardMeeting extends AppCompatActivity {
    Button hit, cheat;
    TextView intelligence, brave, luck;
    private boolean isBraveBig(){
        if (BytulkaMeeting.brave_characteristics - BytulkaMeeting.intelligence_characteristics > 1){
            return true;
        }
        else
            return false;
    }

    private boolean isBraneBig(){
        if (BytulkaMeeting.intelligence_characteristics - BytulkaMeeting.brave_characteristics > 1){
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
        setContentView(R.layout.activity_guard_meeting);
        hit = findViewById(R.id.hit);
        cheat = findViewById(R.id.cheat);
        findAllCharacteristics();
        setAllCharacteristics();
        hit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isBraveBig()){
                    BytulkaMeeting.brave_characteristics++;
                    Intent winGuard = new Intent(GuardMeeting.this,
                            GuardSuccessed.class);
                    startActivity(winGuard);
                    finish();
                }
                else{
                    Intent defeatGuard = new Intent(GuardMeeting.this,
                            GuardMeetingFailed.class);
                    startActivity(defeatGuard);
                    finish();
                }
            }
        });

        cheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isBraneBig()){
                    BytulkaMeeting.intelligence_characteristics++;
                    Intent dodgeGuard = new Intent(GuardMeeting.this,
                            GuardMeetingSuccessedDodge.class);
                    startActivity(dodgeGuard);
                    finish();
                }
                else{
                    Intent dodgeGuardFailed = new Intent(GuardMeeting.this,
                            GuardMeetingFailedDodge.class);
                    startActivity(dodgeGuardFailed);
                    finish();
                }
            }
        });



    }
}