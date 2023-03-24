package src;

import src.com.waked.challenge.domain.Course;
import src.com.waked.challenge.domain.Mentorship;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("java course");
        course1.setDescription("java course description");
        course1.setWordkload(8);

        Course course2 = new Course();
        course2.setTitle("js course");
        course2.setDescription("js course description");
        course2.setWordkload(4);

        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("java mentorship");
        mentorship.setDescription("java mentorship description");
        mentorship.setDate(LocalDate.now());

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentorship);
    }
}
