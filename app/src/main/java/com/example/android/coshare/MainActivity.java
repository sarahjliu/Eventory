package com.example.android.coshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button rsvpButton;
    Button calendarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rsvpButton = (Button) findViewById((R.id.rsvp_button));
        calendarButton = (Button) findViewById((R.id.calendar_button));

    }

}
