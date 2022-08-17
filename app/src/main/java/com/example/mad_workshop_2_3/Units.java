package com.example.mad_workshop_2_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Units extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_units);

        Button metricButton;
        Button imperialButton;

        metricButton = findViewById(R.id.metricButton);
        imperialButton = findViewById(R.id.imperialButton);

        metricButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Units.this, Metric_Activity.class);
                startActivity(intent);
            }
        });

        imperialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Units.this, Imperial_Activity.class);
                startActivity(intent);
            }
        });


    }
}