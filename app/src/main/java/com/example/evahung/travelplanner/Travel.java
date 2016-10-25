package com.example.evahung.travelplanner;

/**
 * Created by Eva Hung on 26/10/2016.
 */
public class Travel {
    int travelID;
    String travel_name;
    float budget;

    public int getTravelID() {
        return travelID;
    }

    public void setTravelID(int travelID) {
        this.travelID = travelID;
    }

    public String getTravel_name() {
        return travel_name;
    }

    public void setTravel_name(String travel_name) {
        this.travel_name = travel_name;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }
}
