package com.example.android.coshare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    Button rsvpButton;
    Button calendarButton;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rsvpButton = (Button) findViewById((R.id.rsvp_button));
        calendarButton = (Button) findViewById((R.id.calendar_button));
        backButton = (Button)findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener()
        {    public void onClick(View v)
        {
            Intent intent = new Intent(MainActivity.this, list.class);
            startActivity(intent);
            finish();
        }
        });
    }

}
