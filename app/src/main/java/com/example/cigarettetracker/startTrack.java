package com.example.cigarettetracker;


import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.Date;

public class startTrack extends MainActivity {

    Button mButton;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tracker_display);

        mButton = findViewById(R.id.add_button);

        //create a date string

        String date_n = new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(new Date());
        TextView date  = findViewById(R.id.date);
        date.setText(date_n);
    }}

//    mButton.setOnClickListener(new View.OnClickListener() {
//
//        }

//    @public void add_Cigarette(){
//        // Init tallys
//
//        int dayTally = 0;
//        int timeLost = 0;
//
//        // Log entry
//
//        // Add to dayTally
//
//        dayTally = dayTally + 1;
//        timeLost = dayTally * 7;
//
//
//        // Display new tallys & time lost
//
//        TextView dayCount = findViewById(R.id.note);
//        dayCount.setText(dayTally);
//
//        TextView timeText =findViewById(R.id.timeView);
//        timeText.setText(timeLost + R.string.minutes_word);
//
//    }
//
//
//
//
//}