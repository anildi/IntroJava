package ttl.labs.labfourab;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author whynot
 */
public class TestLab6 {

    @Test
    public void testVisitingStudent() {
        VisitingStudent vs = new VisitingStudent("Marth", "Stewart", LocalDate.of(1960, 4, 8), "JNU");

        assertEquals("Marth", vs.getFirstName());

        String ci = vs.getCurrentInfo();

        assertTrue(ci.contains("JNU"));
    }

    @Test
    public void testPolymorphicArray() {
        Student [] students = {
                new Student("Joe", "Mcgasko", LocalDate.of(185, 5, 7)),
                new VisitingStudent("Marth", "Stewart", LocalDate.of(1960, 4, 8), "JNU"),
                new Student("Jill", "Mcgasko", LocalDate.of(185, 5, 7)),
                new VisitingStudent("Hobart", "Stewart", LocalDate.of(1960, 4, 8), "JNU"),
        };

        for(Student s : students) {
            System.out.println(s.getCurrentInfo());
        }
    }
}
