package ttl.larku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ttl.larku.dao.StudentDAO;
import ttl.larku.domain.Student;

import java.util.List;

/**
 * @author whynot
 */

@Component
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

//    private StudentDAO studentDAO = new StudentDAO();

    public List<Student> getStudents() {
        return studentDAO.getAll();
    }

    public Student getStudent(int id) {
        return studentDAO.get(id);
    }

    public Student addStudent(Student student) {
        return studentDAO.insert(student);
    }
}
