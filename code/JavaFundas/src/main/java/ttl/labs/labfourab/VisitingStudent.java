package ttl.labs.labfourab;

import java.time.LocalDate;

/**
 * @author whynot
 * Create a subclass of Student called VisitingStudent.
 * Resolve constructor requirements properly.
 * Add a field to VisitingStudent called homeUniversity that will
 * hold the student’s home university.
 *
 * Modify the currentInfo behaviour so that for Visiting Students
 * it also indicates the home University.
 */
public class VisitingStudent extends Student {

    private String homeUniversity;

    public VisitingStudent(String firstName, String lastName, LocalDate dob, String homeUniversity) {
        super(firstName, lastName, dob);

        this.homeUniversity = homeUniversity;

    }

    public String getHomeUniversity() {
        return homeUniversity;
    }

//    public void setHomeUniversity(String homeUniversity) {
//        this.homeUniversity = homeUniversity;
//    }

    @Override
    public String getCurrentInfo() {
        //return "id: " + getId() + ", " + getFormalName() + ", active: " + isActive() + ", homeUniversity: " + homeUniversity;
        return super.getCurrentInfo() + ", homeUniversity: " + homeUniversity;
    }
}
