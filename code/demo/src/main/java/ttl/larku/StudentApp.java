package ttl.larku;

import ttl.larku.domain.Student;
import ttl.larku.service.StudentService;

import java.time.LocalDate;

/**
 * @author whynot
 */
public class StudentApp {

    public static void main(String[] args) {
        StudentService ss = new StudentService();

        Student student1 = new Student("Francine", "Baker", LocalDate.of(1986, 9, 3));

        System.out.println("student1: " + student1);

        Student newStudent = ss.addStudent(student1);

        System.out.println("student1: " + student1 + ", newStudent: " + newStudent);
    }
}
