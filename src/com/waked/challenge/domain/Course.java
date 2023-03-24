package src.com.waked.challenge.domain;

public class Course {
    private String title;
    private String description;
    private int wordkload;

    public Course() {

    }

    public Course(String title, String description, int wordkload) {
        this.title = title;
        this.description = description;
        this.wordkload = wordkload;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", wordkload=" + wordkload +
                '}';
    }
}
