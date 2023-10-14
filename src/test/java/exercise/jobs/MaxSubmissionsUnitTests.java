package exercise.jobs;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Part B unit tests
 */
public class MaxSubmissionsUnitTests {

    @Test
    public void maxSubmissionsDay() {
        Applicant a1 = new Applicant("a", "b", 1, 4);
        Applicant a2 = new Applicant("c", "d", 2, 5);
        Applicant a3 = new Applicant("e", "f", 4, 4);
        Applicant a4 = new Applicant("g", "h", 5, 5);

        Submissions submissions = new Submissions();
        submissions.add(a1);
        submissions.add(a2);
        submissions.add(a3);
        submissions.add(a4);

        assertEquals(4, submissions.maxSubmissionsDay());
    }

}