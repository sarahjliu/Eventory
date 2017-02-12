package com.example.android.coshare;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.ExpandedMenuView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.android.calendar.R;

    import java.util.ArrayList;
    import java.util.Locale;

    import android.os.Bundle;
    import android.app.Activity;
    import android.text.Editable;
    import android.text.TextWatcher;
    import android.view.Menu;
    import android.widget.EditText;
    import android.widget.ListView;

public class list extends AppCompatActivity{

        // Declare Variables
        ListView list;
        EditText editsearch;
        String[] rank;
        String[] country;
        String[] population;
        ArrayList<EventInfo> arraylist = new ArrayList<EventInfo>();

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.listview_main);

            // Generate sample data
            rank = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

            country = new String[] { "China", "India", "United States",
                    "Indonesia", "Brazil", "Pakistan", "Nigeria", "Bangladesh",
                    "Russia", "Japan" };

            population = new String[] { "1,354,040,000", "1,210,193,422",
                    "315,761,000", "237,641,326", "193,946,886", "182,912,000",
                    "170,901,000", "152,518,015", "143,369,806", "127,360,000" };

            // Locate the ListView in listview_main.xml
            list = (ListView) findViewById(R.id.listview);

            for (int i = 0; i < rank.length; i++)
            {
                EventInfo wp = new EventInfo(rank[i], country[i],
                        population[i]);
                // Binds all strings into an array
                arraylist.add(wp);
            }
            };


        // Not using options menu in this tutorial
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.activity_main, menu);
            return true;
        }
    }
