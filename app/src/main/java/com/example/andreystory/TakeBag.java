package com.example.andreystory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TakeBag extends AppCompatActivity {
    Button take, dont_take;

    private void endgame(){
        if (BytulkaMeeting.luck_characteristics == 100){
            Intent secretEnd = new Intent(TakeBag.this,
                    SecretEnd.class);
            startActivity(secretEnd);
            finish();
        }
        else if(BytulkaMeeting.brave_characteristics > BytulkaMeeting.intelligence_characteristics){
            Intent braveEnd = new Intent(TakeBag.this,
                    BraveEnd.class);
            startActivity(braveEnd);
            finish();
        }
        else{
            Intent intelegenceEnd = new Intent(TakeBag.this,
                    InetelldgenceEnd.class);
            startActivity(intelegenceEnd);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_bag);

        take = findViewById(R.id.take);
        dont_take = findViewById(R.id.dont_take);

        take.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endgame();
            }
        });

        dont_take.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "самый умный ебать?", Toast.LENGTH_SHORT).show();
                endgame();

            }
        });


    }
}