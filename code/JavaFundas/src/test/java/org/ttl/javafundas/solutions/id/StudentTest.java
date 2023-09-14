package org.ttl.javafundas.solutions.id;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author whynot
 */
public class StudentTest {

    @Test
    public void testConstructor() {
        String firstName = "Joey";
        String lastName = "Ramone";
        Student s = new Student(firstName, lastName, LocalDate.of(1960, 2, 20));

        assertEquals(Student.Status.FULL_TIME, s.getStatus());
    }

    @Test
    public void testFormalName() {
        String firstName = "Joey";
        String lastName = "Ramone";
        Student s = new Student(firstName, lastName, LocalDate.of(1960, 2, 20));

        assertEquals(lastName + ", " + firstName, s.getFormalName());
    }

    @Test
    public void testIsActive() {
        String firstName = "Joey";
        String lastName = "Ramone";
        Student s = new Student(firstName, lastName, LocalDate.of(1960, 2, 20));

        assertTrue(s.isActive());
    }

    @Test
    public void testIdGeneration() {
        String firstName = "Joey";
        String lastName = "Ramone";
        int expectedId = Student.getNextId() + 1;
        Student s = new Student(firstName, lastName, LocalDate.of(1960, 2, 20));

        assertEquals(expectedId, s.getId());
    }
}
