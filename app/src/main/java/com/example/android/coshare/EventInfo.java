package com.example.android.coshare;

/**
 * Created by Sarah on 2/12/2017.
 */
public class EventInfo {
    private String rank;
    private String country;
    private String population;

    public EventInfo(String rank, String country, String population) {
        this.rank = rank;
        this.country = country;
        this.population = population;
    }

    public String getRank() {
        return this.rank;
    }

    public String getCountry() {
        return this.country;
    }

    public String getPopulation() {
        return this.population;
    }
}
