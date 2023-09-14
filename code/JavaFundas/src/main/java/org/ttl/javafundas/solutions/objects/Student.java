package org.ttl.javafundas.solutions.objects;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author whynot
 */
public class Student {
    public enum Status {
        FULL_TIME,
        PART_TIME,
        HIBERNATING
    }
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private Status status;

    public Student(String firstName, String lastName, LocalDate dob) {
        this(firstName, lastName, dob, Status.FULL_TIME);

    }

    public Student(String firstName, String lastName, LocalDate dob, Status status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.status = status;
    }

    public boolean isActive() {
        return status == Status.FULL_TIME || status == Status.PART_TIME;
    }

    public String getCurrentInfo() {
        return getFormalName() + ", active: " + isActive();
    }

    public String getFormalName() {
        return lastName + ", " + firstName;
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
        this.dob = dob;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(dob, student.dob) &&
                status == student.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dob, status);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", localDate=" + dob +
                ", status=" + status +
                '}';
    }
}
