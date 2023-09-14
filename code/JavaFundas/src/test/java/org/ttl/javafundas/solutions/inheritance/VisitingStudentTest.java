package org.ttl.javafundas.solutions.inheritance;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author whynot
 */
public class VisitingStudentTest {

    private String homeUniversity = "FabulousU";
    private String firstName = "Joey";
    private String lastName = "Ramone";

    @Test
    public void testConstructor() {
        VisitingStudent s = new VisitingStudent(firstName, lastName, LocalDate.of(1960, 2, 20), homeUniversity);

        assertEquals(Student.Status.FULL_TIME, s.getStatus());
    }

    @Test
    public void testFormalName() {
        VisitingStudent s = new VisitingStudent(firstName, lastName, LocalDate.of(1960, 2, 20), homeUniversity);

        assertEquals(lastName + ", " + firstName, s.getFormalName());
    }

    @Test
    public void testIsActive() {
        VisitingStudent s = new VisitingStudent(firstName, lastName, LocalDate.of(1960, 2, 20), homeUniversity);

        assertTrue(s.isActive());
    }

    @Test
    public void testIdGeneration() {
        int expectedId = VisitingStudent.getNextId() + 1;
        VisitingStudent s = new VisitingStudent(firstName, lastName, LocalDate.of(1960, 2, 20), homeUniversity);

        assertEquals(expectedId, s.getId());
    }

    @Test
    public void testVisitingStudentInfo() {
        VisitingStudent s = new VisitingStudent(firstName, lastName, LocalDate.of(1960, 2, 20), homeUniversity);

        String currentInfo = s.getCurrentInfo();

        assertTrue(currentInfo.contains(homeUniversity));

    }
}
