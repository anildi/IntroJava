package ttl.labs;

import org.junit.jupiter.api.Test;
import ttl.labs.labfourab.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author whynot
 */
public class TestLab5 {

    @Test
    public void testGenerateId() {
        Student student1 = new Student("Adam", "Smith", LocalDate.of(1856, 10, 10));
        Student student2 = new Student("Rachna", "Pathak", LocalDate.of(1970, 10, 10));

        assertEquals(2, student2.getId());
    }

    @Test
    public void testArrayOfStudents() {
        Student[] students = new Student[3];

        students[0] = new Student("Adam", "Smith", LocalDate.of(1856, 10, 10));
        students[1] = new Student("Rachna", "Pathak", LocalDate.of(1970, 10, 10));
        students[2] = new Student("Rohan", "Kanhai", LocalDate.of(1970, 10, 10));

//        students[3] = new Student("Someone", "Else", LocalDate.now());

        assertEquals(7, students[2].getId());

        assertEquals("Rachna", students[1].getFirstName());
    }

    @Test
    public void testListOfStudents() {
        Student[] students = new Student[3];

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Adam", "Smith", LocalDate.of(1856, 10, 10), Student.Status.HIBERNATING));
        studentList.add(new Student("Rachna", "Pathak", LocalDate.of(1970, 10, 10)));
        studentList.add(new Student("Rohan", "Kanhai", LocalDate.of(1970, 10, 10)));
        studentList.add(new Student("Someone", "Else", LocalDate.of(1980, 5, 14)));

        assertEquals(7, studentList.get(2).getId());

        assertEquals("Rachna", studentList.get(1).getFirstName());

        int count = 0;
        for(Student student : studentList) {
            if(student.getStatus() == Student.Status.HIBERNATING) {
                count++;
            }
        }

        assertEquals(1, count);
    }
}
