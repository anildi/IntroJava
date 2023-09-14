package ttl.labs.labfourab;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author whynot
 */
public class TestStudent {

    @Test
    public void testStudent() {
        Student student = new Student();
        student.setFirstName("Joe");
        student.setLastName("Smith");
        student.setDob(LocalDate.of(1986, 10, 10));
        student.setStatus("FullTime");

        System.out.println(
                 "name: " + student.getFirstName() +
                " lastName: " + student.getLastName() +
                " Dob: " + student.getDob() +
                " Status: " + student.getStatus()
        );

        assertEquals("Joe", student.getFirstName());
    }

    @Test
    public void testStudentWithBadDob() {
        assertThrows(RuntimeException.class, () -> {
            Student student = new Student();
            student.setFirstName("Joe");
            student.setLastName("Smith");
            student.setDob(LocalDate.now());
            student.setStatus("FullTime");

        });
    }
}
