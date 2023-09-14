package org.ttl.javafundas.solutions.exceptions;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * @author whynot
 */
public class ExceptionApp {
    public static void main(String[] args) {
        try {
            List<Student> students = List.of(
                    new Student("Joe", "Pass", LocalDate.of(1945, 2, 15)),
                    new VisitingStudent("Jimi", "Hendrix", LocalDate.of(1935, 5, 25), "Oxford"),
                    new VisitingStudent("Charlie", "Byrd", LocalDate.of(1960, 9, 1), Student.Status.HIBERNATING, "Heidelberg"),
                    new Student("Herb", "Ellis", LocalDate.of(1945, 2, 15)),
                    new Student("Roger", "Waters", LocalDate.of(2020, 2, 15))
            );

            for (Student student : students) {
                System.out.println(student.getCurrentInfo());
            }

        }catch(InvalidStudentException e) {
            e.printStackTrace();
        }
    }
}
