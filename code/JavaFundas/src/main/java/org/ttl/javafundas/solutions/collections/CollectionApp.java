package org.ttl.javafundas.solutions.collections;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author whynot
 */
public class CollectionApp {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Joe", "Pass", LocalDate.of(1945, 2, 15)),
                new VisitingStudent("Jimi", "Hendrix", LocalDate.of(1935, 5, 25), "Oxford"),
                new VisitingStudent("Charlie", "Byrd", LocalDate.of(1960, 9, 1), Student.Status.HIBERNATING, "Heidelberg"),
                new Student("Herb", "Ellis", LocalDate.of(1945, 2, 15))
        );

//        for (Student student : students) {
//            System.out.println(student.getCurrentInfo());
//        }


        Map<Integer, Student> map = makeStudentMap(students);
        for(Map.Entry<Integer, Student> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    public static Map<Integer, Student> makeStudentMap(List<Student> students) {
        Map<Integer, Student> result = new HashMap<>();
        for(Student student : students) {
            result.put(student.getId(), student);
        }

        return result;
    }
}
