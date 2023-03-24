package src.com.waked.challenge.domain;

import java.time.LocalDate;

public class Mentorship extends Content{

    private LocalDate date;

    public Mentorship() { }

    @Override
    protected double calculateXP() {
        return XP_DEFAULT + 20d;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentorship{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
