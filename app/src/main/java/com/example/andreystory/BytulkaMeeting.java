package com.example.andreystory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BytulkaMeeting extends AppCompatActivity {
    TextView intelligence, brave, luck;
    public static int intelligence_characteristics, brave_characteristics, luck_characteristics;
    private void setAllCharacteristics(){
        intelligence.setText(Integer.valueOf(intelligence_characteristics).toString());
        brave.setText(Integer.valueOf(brave_characteristics).toString());
        luck.setText(Integer.valueOf(luck_characteristics).toString());
    }

    private void findAllCharacteristics(){
        intelligence = findViewById(R.id.intelligence);
        brave = findViewById(R.id.brave);
        luck = findViewById(R.id.luck);
    }
    private void zeroingCharacteristics(){
        intelligence_characteristics = 0;
        brave_characteristics = 0;
        luck_characteristics = 0;
    }

    Button drink, dont_drink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bytulka_meeting);

        findAllCharacteristics();
        zeroingCharacteristics();


        drink = findViewById(R.id.drink);
        dont_drink = findViewById(R.id.dont_drink);

        drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                brave_characteristics++;
                setAllCharacteristics();
                Intent drink_tolik = new Intent(BytulkaMeeting.this,
                        TolikMeeting.class);
                startActivity(drink_tolik);
                finish();
            }
        });

        dont_drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intelligence_characteristics++;
                setAllCharacteristics();
                Intent drink_tolik = new Intent(BytulkaMeeting.this,
                        TolikMeeting.class);
                startActivity(drink_tolik);
                finish();
            }
        });
    }
    //киньте денег, умоляю. Сбер +79996428442
    public void joke(View view) {
        Toast.makeText(getApplicationContext(),
                "самый умный ебать?", Toast.LENGTH_SHORT).show();
    }
}