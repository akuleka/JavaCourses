package ru.java.courses.Lesson9;

import java.util.Objects;

public class Athlete extends Person {
    private int salary;
    private SportTitle title;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public SportTitle getTitle() {
        return title;
    }

    public void setTitle(SportTitle title) {
        this.title = title;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Athlete athlete = (Athlete) o;
        return salary == athlete.salary &&
                Objects.equals(title, athlete.title);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), salary, title);
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "salary=" + salary +
                ", title=" + title +
                "} " + super.toString();
    }
}
