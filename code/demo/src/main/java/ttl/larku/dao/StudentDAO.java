package ttl.larku.dao;

import org.springframework.stereotype.Component;
import ttl.larku.domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author whynot
 */

@Component
public class StudentDAO {

//    private List<Student> students;
    private Map<Integer, Student> students = new ConcurrentHashMap<>();
    private AtomicInteger nextId = new AtomicInteger(1);

    public List<Student> getAll() {
        return new ArrayList<>(students.values());
    }

    public Student get(int id) {
        Student s = students.get(id);
        return s;
    }

    public Student insert(Student newStudent) {
        int id = nextId.getAndIncrement();
        newStudent.setId(id);

        students.put(id, newStudent);

        return newStudent;
    }
}
