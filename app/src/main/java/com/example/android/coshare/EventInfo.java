package com.example.android.coshare;

/**
 * Created by Sarah on 2/12/2017.
 */
public class EventInfo {
    private String date;
    private String name;
    private String location;

    public EventInfo(String date, String name, String location) {
        this.date = date;
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return this.name;
    }

    public String getDate() {
        return this.date;
    }

    public String getLocation() {
        return this.location;
    }
}
