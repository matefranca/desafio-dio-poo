package src;

import src.com.waked.challenge.domain.Bootcamp;
import src.com.waked.challenge.domain.Course;
import src.com.waked.challenge.domain.Dev;
import src.com.waked.challenge.domain.Mentorship;

import java.time.LocalDate;
import java.util.Set;

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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Java Developer Bootcamp");
        bootcamp.setDescription("Java Developer Bootcamp Description");
        bootcamp.getContents().addAll(Set.of(course1, course2, mentorship));

        Dev devMatheus = new Dev();
        devMatheus.setName("Matheus");
        devMatheus.subscribeBootcamp(bootcamp);
        System.out.println("Subscribed content = " + devMatheus.getContentsSubscribed());
        System.out.println("---");
        devMatheus.progress();
        System.out.println("Finished content = " + devMatheus.getContentsFinished());
        System.out.println("Subscribed content = " + devMatheus.getContentsSubscribed());
        System.out.println("XP: " + devMatheus.calculateTotalXP());

        System.out.println("----------------");
        Dev devTalita = new Dev();
        devTalita.setName("Talita");
        devTalita.subscribeBootcamp(bootcamp);
        System.out.println("Subscribed content = " + devTalita.getContentsSubscribed());
        devTalita.progress();
        devTalita.progress();
        devTalita.progress();
        System.out.println("---");
        System.out.println("Finished content = " + devTalita.getContentsFinished());
        System.out.println("Subscribed content = " + devTalita.getContentsSubscribed());
        System.out.println("XP: " + devTalita.calculateTotalXP());
    }
}
