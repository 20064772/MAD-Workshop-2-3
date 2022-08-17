package com.example.mad_workshop_2_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button yesButton;
        Button noButton;
        TextView AreYou20;
        TextView warning;

        yesButton = (Button) findViewById(R.id.yesButton);
        noButton = (Button) findViewById(R.id.noButton);
        AreYou20 = (TextView) findViewById(R.id.AreYou20);
        warning = (TextView) findViewById(R.id.warning);


        yesButton.setOnClickListener(new View.OnClickListener()
        {

        // from here down need to be changed. Look at lectures and go from there.
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, Units.class);
                startActivity(intent);
            }
        });

        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                warning.setText("You must be 20 years old to use this calculator");
            }
        });
    }


}