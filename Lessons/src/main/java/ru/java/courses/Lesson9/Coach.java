package ru.java.courses.Lesson9;

public class Coach extends Person {
    private int experience = 0;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Coach() {
    }

    public Coach(int experience) {
        this.experience = experience;
    }
}
