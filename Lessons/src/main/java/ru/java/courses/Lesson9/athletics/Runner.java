package ru.java.courses.Lesson9.athletics;

import ru.java.courses.Lesson9.Athlete;
import ru.java.courses.Lesson9.Coach;

import java.util.Objects;

public class Runner extends Athlete {
    private Coach coach;
    private int timeRecord = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Runner runner = (Runner) o;
        return
                timeRecord == runner.timeRecord &&
                Objects.equals(coach, runner.coach);
    }

    @Override
    public int hashCode() {

        return Objects.hash(coach, timeRecord);
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public int getTimeRecord() {
        return timeRecord;
    }

    public void setTimeRecord(int timeRecord) {
        this.timeRecord = timeRecord;
    }

    public Runner() {
    }

    public Runner(Coach coach, int age, int timeRecord) {
        this.coach = coach;
        this.timeRecord = timeRecord;
    }
}


