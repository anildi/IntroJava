package ttl.labs.labfourab;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author whynot
 */
public class Student {

    public enum Status {
        FULLTIME,
        PARTTIME,
        HIBERNATING
    }

//    public final static String FULL_TIME = "Fulltime";
//    public final static String PART_TIME = "Parttime";
//    public final static String HIBERNATING = "Hibernating";

    private String firstName;
    private String lastName;
    private LocalDate dob;

    private Status status;

    private int id;

    private static int nextId = 5;
    /*
    Provide a constructor that takes a first name, last name and
date of birth as arguments, and another that takes
arguments for all fields. Create any other constructors you
think would be useful.
     */

    public Student(String firstName, String lastName, LocalDate dob, Status status) {
        this.firstName = firstName;
        this.lastName = lastName;
        setDob(dob);
        this.status = status;

        this.id = nextId++;
    }

    public Student(String firstName, String lastName, LocalDate dob) {
        this(firstName, lastName, dob, Status.FULLTIME);
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.dob = dob;
//        this.status = "FullTime";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
        if (age > 18) {
            this.dob = dob;
        } else {
            throw new RuntimeException("age too low: " + age);
        }
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    /*
    Create a method that returns the formal name of a student
lastname, firstname
*/
    public String getFormalName() {
        return firstName + ", " + lastName;
    }
    /*
●
Create a method called isActive that checks whether a
student is active or not.
returns true if the Status is Fulltime or Parttime
●
returns false if the Status is Hibernating
●
*/

    public boolean isActive() {
//        if(status == "FullTime" || status == "Hibernating") {
        if (status.equals("FullTime") || status.equals("Hibernating")) {
            return true;
        } else {
            return false;
        }
    }
/*
Create a method called getCurrentInfo that returns the
formal name and whether the student is active or not.
*/
    public String getCurrentInfo() {
        return "id: " + id + ", " + getFormalName() + ", active: " + isActive();
    }
}
