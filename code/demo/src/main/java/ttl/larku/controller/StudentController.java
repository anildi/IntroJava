package ttl.larku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ttl.larku.domain.Student;
import ttl.larku.service.StudentService;

import java.util.List;

/**
 * @author whynot
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> students = studentService.getStudents();
        return students;
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable("id") int id) {
        Student s = studentService.getStudent(id);
        return s;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        Student addedStudent = studentService.addStudent(student);
        return addedStudent;
    }
}
