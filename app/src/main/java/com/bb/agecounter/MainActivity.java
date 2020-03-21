package com.bb.agecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView showCounterTextView;
    Button incrementButton;
    Button decrementButton;
    Button resetButton;
    TextView displayTextView;

    int counter = 0;
    int max = 120;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showCounterTextView = findViewById(R.id.count_textview);
        displayTextView = findViewById(R.id.display_message_textview);
        incrementButton = findViewById(R.id.increment_button);
        decrementButton = findViewById(R.id.decrement_button);
        resetButton = findViewById(R.id.reset_button);

        showCounterTextView.setText("0");

        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                counter = counter +1;
                showCounterTextView.setText(String.valueOf(counter));
                displayMessage();

            }

        });

        decrementButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                counter = counter-1;
                showCounterTextView.setText(String.valueOf(counter));
                displayMessage();
        }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 counter = 0;
                showCounterTextView.setText(String.valueOf(counter));
                displayMessage();
            }
        });

    }

    private void displayMessage() {
        String text = null;
        int number = Integer.parseInt(String.valueOf(showCounterTextView.getText()));
        if (number == 0){
            text = "Newborn";
        }else if(number == 1){
            text = "Infant";
        }else if(number >= 2 && number <= 5){
            text = "Toddler";
        }else if(number >= 6 && number <= 12){
            text = "Child";
        }else if(number >= 13 && number <= 17){
            text = "Teenager";
        }else if(number <= max ){
            text = "Adult";
        }
        displayTextView.setText(text);
    }
}
