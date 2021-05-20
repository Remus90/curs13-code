package ro.fasttrackit.curs13.homework;

import java.util.ArrayList;
import java.util.List;

public class DailyPlanner {
    private final List<DaySchedule> daySchedules = new ArrayList<>();

    public List<DaySchedule> getDaySchedules() {

        return daySchedules;
    }

    public List<String> getActivities(Day day) {
        for (DaySchedule schedule : daySchedules) {
            if (schedule.getDay().equals(day)) {
                return schedule.getActivities();
            }
        }
        return List.of();
    }

    public void addActivity(Day day, String activity) {
        DaySchedule foundSchedule = null;
        for (DaySchedule schedule : daySchedules) {
            if (schedule.getDay().equals(day)) {
                foundSchedule = schedule;
                break;
            }
        }
        if (foundSchedule == null) {
            foundSchedule = new DaySchedule(day);
            daySchedules.add(foundSchedule);
        }
        foundSchedule.addActivity(activity);
    }
}
