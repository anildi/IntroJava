package org.ttl.javafundas.solutions.inheritance;

import java.time.LocalDate;

/**
 * @author whynot
 */
public class VisitingStudent extends Student {

    private String homeUniversity;

    public VisitingStudent(String firstName, String lastName, LocalDate dob, String homeUniversity) {
        this(firstName, lastName, dob, Student.Status.FULL_TIME, homeUniversity);

    }

    public VisitingStudent(String firstName, String lastName, LocalDate dob, Student.Status status,
                           String homeUniversity) {
        super(firstName, lastName, dob, status);

        this.homeUniversity = homeUniversity;
    }

    public String getHomeUniversity() {
        return homeUniversity;
    }

    @Override
    public String getCurrentInfo() {
       return super.getCurrentInfo() + ", homeUniversity: " + homeUniversity;
    }
}
