package com.example.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button button_harsh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //fo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r viewing design
        button_harsh = findViewById(R.id.button_harsh);
        button_harsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

}