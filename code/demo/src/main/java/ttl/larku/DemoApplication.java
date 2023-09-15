package ttl.larku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import ttl.larku.domain.Student;
import ttl.larku.service.StudentService;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@Component
class MyInitializer implements CommandLineRunner
{

	@Autowired
	private StudentService studentService;

	@Override
	public void run(String... args) throws Exception {
		studentService.addStudent(new Student("Joe", "Shmoe", LocalDate.of(1976, 3, 6)));
		studentService.addStudent(new Student("Mary", "Louf", LocalDate.of(1976, 3, 6)));
		studentService.addStudent(new Student("Manoj", "Dawason", LocalDate.of(2000, 3, 6)));
	}
}
