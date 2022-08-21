package com.example.mad_workshop_2_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class Metric_Activity extends AppCompatActivity {

    private SeekBar seekHeight;
    private SeekBar seekWeight;
    private TextView displayHeight;
    private TextView displayWeight;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metric);

        SeekBar seekHeight = (SeekBar) findViewById(R.id.seekHeight);
        SeekBar seekWeight = (SeekBar) findViewById(R.id.seekWeight);
        TextView displayHeight = (TextView) findViewById(R.id.displayHeight);
        TextView displayWeight = (TextView) findViewById(R.id.displayWeight);
        Button Next = (Button) findViewById(R.id.next);
        seekHeight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                displayHeight.setText("" + i +"cm");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }
        });

        seekWeight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                displayWeight.setText("" + i + "kg");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}