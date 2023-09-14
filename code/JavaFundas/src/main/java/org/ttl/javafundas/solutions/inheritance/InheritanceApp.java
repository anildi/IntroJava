package org.ttl.javafundas.solutions.inheritance;

import java.time.LocalDate;

/**
 * @author whynot
 */
public class InheritanceApp {

    public static void main(String[] args) {
        Student[] students = {
                new Student("Joe", "Pass", LocalDate.of(1945, 2, 15)),
                new VisitingStudent("Jimi", "Hendrix", LocalDate.of(1935, 5, 25), "Oxford"),
                new VisitingStudent("Charlie", "Byrd", LocalDate.of(1960, 9, 1), Student.Status.HIBERNATING, "Heidelberg"),
                new Student("Herb", "Ellis", LocalDate.of(1945, 2, 15)),
        };

        for(Student student: students) {
            System.out.println(student.getCurrentInfo());
        }
    }
}
