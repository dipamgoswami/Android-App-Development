package com.example.dipamgoswami.timestablesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView timesTablesListView;

    public void generateTimesTable(int number){
        ArrayList<String> timesTablesContent = new ArrayList<String>();
        for (int j=1;j<=10;j++){
            timesTablesContent.add(Integer.toString(j*number));
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,timesTablesContent);

        timesTablesListView.setAdapter(arrayAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SeekBar timesTablesSeekBar = findViewById(R.id.timesTablesSeekBar);
        timesTablesListView = findViewById(R.id.timesTablesListView);

        int max = 20;
        int setProgress = 10;
        timesTablesSeekBar.setMax(max);
        timesTablesSeekBar.setProgress(setProgress);
        generateTimesTable(setProgress);

        timesTablesSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int min = 1;
                int number;
                if (progress<min){
                    number = min;
                    timesTablesSeekBar.setProgress(min);
                }else{
                    number = progress;
                }
                Log.i("SeekBar Value", Integer.toString(number));

                generateTimesTable(number);
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
