package com.example.evahung.travelplanner;

/**
 * Created by Eva Hung on 2/11/2016.
 */
public class Expense {
    String name;
    Tag tag;
    float expense;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public float getExpense() {
        return expense;
    }

    public void setExpense(float expense) {
        this.expense = expense;
    }
}
