package ttl.labs.labfourab;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author whynot
 */
public class  Student{
    /*
    Create a class called Student. The class should have at least
the following properties
●A first name and a last name
●A date of birth of type LocalDate
more info on LocalDate on the next slide
●
A status which can be one of
●
Fulltime
●
Parttime
●
Hibernating

Make sure you Student class properly encapsulates its
variables.
private variables
●
getters and setters
     */

    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String status;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        long age = dob.until(LocalDate.now(), ChronoUnit.YEARS);
        if(age > 18) {
            this.dob = dob;
        } else {
            throw new RuntimeException("age too low: " + age);
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
