package src.com.waked.challenge.domain;

public class Course extends Content {
    private int wordkload;

    public Course() {

    }

    @Override
    protected double calculateXP() {
        return XP_DEFAULT * wordkload;
    }

    public int getWordkload() {
        return wordkload;
    }

    public void setWordkload(int wordkload) {
        this.wordkload = wordkload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", wordkload=" + wordkload +
                '}';
    }
}
