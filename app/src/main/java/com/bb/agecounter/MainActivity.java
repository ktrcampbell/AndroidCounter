package com.bb.agecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView showCounter;
    Button bIncrement;
    Button bDecrement;
    TextView display;

    int counter = 0;
    int max = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showCounter = findViewById(R.id.count);
        bIncrement = findViewById(R.id.btn_inc);
        bDecrement = findViewById(R.id.btn_dec);

        showCounter.setText("0");

        bIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                if(counter < 1){
                    display.setText("Newborn");}
                    else if(counter > 1 & counter < 12){
                        display.setText("Child");}
                    else if(counter > 13 & counter < 18){
                        display.setText("Teen");}
                    else{
                        display.setText("Adult");
                }
                showCounter.setText(String.valueOf(counter));
            }

        });
        bDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter--;
                if (counter < 1) {
                    display.setText("Newborn");
                } else if (counter > 1 & counter < 12) {
                    display.setText("Child");
                } else if (counter > 13 & counter < 18) {
                    display.setText("Teen");
                } else if (counter > 18 & counter < max) {
                    display.setText("Adult");
                }

                showCounter.setText(String.valueOf(counter));
                }

        });
    }
}
