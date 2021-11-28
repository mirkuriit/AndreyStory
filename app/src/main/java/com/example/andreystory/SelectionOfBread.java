package com.example.andreystory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SelectionOfBread extends AppCompatActivity {
    TextView intelligence, brave, luck;
    Button white_bread, black_bread, barni_bread;

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
        setContentView(R.layout.activity_selection_of_bread);

        findAllCharacteristics();
        setAllCharacteristics();

        white_bread = findViewById(R.id.white_bread);
        black_bread = findViewById(R.id.black_bread);
        barni_bread = findViewById(R.id.barni_bread);

        white_bread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BytulkaMeeting.brave_characteristics += 99999;
                Intent last_fork = new Intent(SelectionOfBread.this,
                        TakeBag.class);
                startActivity(last_fork);
                finish();
            }
        });

        black_bread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BytulkaMeeting.intelligence_characteristics += 3;
                Intent last_fork = new Intent(SelectionOfBread.this,
                        TakeBag.class);
                startActivity(last_fork);
                finish();
            }
        });

        barni_bread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BytulkaMeeting.luck_characteristics += 100;
                Intent last_fork = new Intent(SelectionOfBread.this,
                        TakeBag.class);
                startActivity(last_fork);
                finish();
            }
        });

    }
}