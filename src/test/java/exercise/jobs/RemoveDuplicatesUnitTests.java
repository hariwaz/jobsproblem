package exercise.jobs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Part A unit tests
 */
public class RemoveDuplicatesUnitTests {

    @Test
    public void oneDup() {
        Applicant p1 = new Applicant("a", "b");
        Applicant p2 = new Applicant("c", "d");
        Applicant p3 = new Applicant("c", "d");

        Submissions submissions = new Submissions();
        submissions.add(p1);
        submissions.add(p2);
        submissions.add(p3);

        checkAssert(submissions, Arrays.asList(p1, p2));
    }

    @Test
    public void oneDup_diffOrder() {
        Applicant p1 = new Applicant("c", "d");
        Applicant p2 = new Applicant("a", "b");
        Applicant p3 = new Applicant("c", "d");

        Submissions submissions = new Submissions();
        submissions.add(p1);
        submissions.add(p2);
        submissions.add(p3);

        checkAssert(submissions, Arrays.asList(p1, p2));
    }

    @Test
    public void oneDup_priorToDeletion() {
        Applicant p1 = new Applicant("a", "b");
        Applicant p2 = new Applicant("c", "d");
        Applicant p3 = new Applicant("c", "d");

        Submissions submissions = new Submissions();
        submissions.add(p1);
        submissions.add(p2);
        submissions.add(p3);

        checkAssert(submissions, Arrays.asList(p1, p2, p3), false);
    }

    private void checkAssert(Submissions submissions, List<Applicant> expected) {
        checkAssert(submissions, expected, true);
    }

    private void checkAssert(Submissions submissions, List<Applicant> expected, boolean removeDuplicates) {
        if (removeDuplicates) {
            submissions.removeDuplicateSubmissions();
        }
        List<Applicant> actual = new ArrayList<>();
        Iterator<Applicant> iterator = submissions.applicantIterator();
        while (iterator.hasNext()) {
            actual.add(iterator.next());
        }
        assertEquals(expected, actual);
    }

}