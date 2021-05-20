package ro.fasttrackit.curs13.homework;

import java.util.ArrayList;
import java.util.List;


public class DaySchedule {

    private final Day day;
    private final List<String> activities;

    public DaySchedule(Day day) {
        this.day = day;
        this.activities = new ArrayList<>();
    }

    public Day getDay() {
        return day;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void addActivity(String activity) {
        this.activities.add(activity);
    }

}
