package com.example.mad_workshop_2_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button yesButton;
        Button noButton;

        yesButton = (Button) findViewById(R.id.yesButton);
        noButton = (Button) findViewById(R.id.noButton);

        yesButton.setOnClickListener(new View.OnClickListener()
        {

        // from here down need to be changed. Look at lectures and go from there.
            @Override
            public void onClick(View v)
            {
                openNewPage();
            }
        });
    }


    public void openNewPage()
    {
        Intent intent = new Intent(this, NewActivity.class);
        startActivity(intent);
    }
}