package com.example.unitconverters;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Selection extends AppCompatActivity {
    private Button btnBack;
    private Button convertCurrency;
    private Button convertUnits;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_selection);
        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openMainMenu();
            }
        });


        convertUnits = (Button) findViewById(R.id.convertUnits);
        convertUnits.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openUnitClass();
            }
        });




    }

    public void openMainMenu() {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    public void openUnitClass() {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }
}
