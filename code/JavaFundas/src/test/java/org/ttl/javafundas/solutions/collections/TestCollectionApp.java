package org.ttl.javafundas.solutions.collections;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author whynot
 */
public class TestCollectionApp {

    @Test
    public void testMapCreation() {

        List<Student> students = List.of(
                new Student("Joe", "Pass", LocalDate.of(1945, 2, 15)),
                new VisitingStudent("Jimi", "Hendrix", LocalDate.of(1935, 5, 25), "Oxford"),
                new VisitingStudent("Charlie", "Byrd", LocalDate.of(1960, 9, 1), Student.Status.HIBERNATING, "Heidelberg"),
                new Student("Herb", "Ellis", LocalDate.of(1945, 2, 15))
        );

        Map<Integer, Student> map = CollectionApp.makeStudentMap(students);

        assertEquals(4, map.size());
        assertEquals("Jimi", map.get(2).getFirstName());
    }
}
