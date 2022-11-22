package com.example.unitconverters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner sp1,sp2;
    EditText ed1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.txtAmount);
        sp1 = findViewById(R.id.spfrom);
        sp2 = findViewById(R.id.spTo);
        b1 = findViewById(R.id.btn1);

        String[] from = {"Grams","Yards","Centimeters","Kilometers","Kilograms","Inches"};
        ArrayAdapter address = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(address);

        String[] to = {"Kilograms","Meters","Inches","Miles","Grams","Centimeters"};
        ArrayAdapter address1 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(address1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double test;
                Double amount = Double.parseDouble(ed1.getText().toString());
                if(sp1.getSelectedItem().toString() == "Grams" && sp2.getSelectedItem().toString() == "Kilograms") {
                    test = amount/1000;
                    Toast.makeText(getApplicationContext(),"In kilograms " + test.toString(), Toast.LENGTH_SHORT).show();
                } else if(sp1.getSelectedItem().toString() == "Yards" && sp2.getSelectedItem().toString() == "Meters" ) {
                    test = amount/0.9144;
                    test = Math.round(test * 100.0)/100.0;
                    Toast.makeText(getApplicationContext(),"In Meters " + test.toString(), Toast.LENGTH_SHORT).show();
                } else if(sp1.getSelectedItem().toString() == "Yards" && sp2.getSelectedItem().toString() == "Inches") {
                    test = amount * 36;
                    Toast.makeText(getApplicationContext(),"In Inches " + test.toString(), Toast.LENGTH_SHORT).show();
                } else if(sp1.getSelectedItem().toString() == "Centimeters" && sp2.getSelectedItem().toString() == "Meters") {
                    test = amount/100;
                    Toast.makeText(getApplicationContext(),"In Meters " + test.toString(), Toast.LENGTH_SHORT).show();
                } else if(sp1.getSelectedItem().toString() == "Kilometers" && sp2.getSelectedItem().toString() == "Miles") {
                    test = amount/1.609344;
                    test = Math.round(test * 100.0)/100.0;
                    Toast.makeText(getApplicationContext(),"In Miles " + test.toString(), Toast.LENGTH_SHORT).show();
                } else if(sp1.getSelectedItem().toString() == "Kilograms" && sp2.getSelectedItem().toString() == "Grams") {
                    test = amount * 1000;
                    Toast.makeText(getApplicationContext(),"In Grams " + test.toString(), Toast.LENGTH_SHORT).show();
                } else if(sp1.getSelectedItem().toString() == "Inches" && sp2.getSelectedItem().toString() == "Centimeters") {
                    test = amount * 2.54;
                    Toast.makeText(getApplicationContext(),"In Centimeters " + test.toString(), Toast.LENGTH_SHORT).show();
                } else if(sp1.getSelectedItem().toString() == "Inches" && sp2.getSelectedItem().toString() == "Meters"){
                    test = amount/39.37;
                    test = Math.round(test * 1000.0)/1000.0;
                    Toast.makeText(getApplicationContext(),"In Meters " + test.toString(), Toast.LENGTH_SHORT).show();

                }




            }
        });


    }
}