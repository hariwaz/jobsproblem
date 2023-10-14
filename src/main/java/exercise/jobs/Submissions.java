package exercise.jobs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Log of all job submissions
 *
 */
public class Submissions {

    private List<Applicant> applicantsList = new ArrayList<Applicant>();
    
	//interface method
    public void add(Applicant applicant) {
    	applicantsList.add(applicant);
    }

    //interface method
    public Iterator<Applicant> applicantIterator() {
        return applicantsList.iterator();
    }

    //interface method - Part A
    public void removeDuplicateSubmissions() {
    	Set<Applicant> set = new HashSet<Applicant>();
    	Iterator<Applicant> ite = applicantIterator();
    	while(ite.hasNext()) set.add(ite.next());
    	applicantsList = new ArrayList<Applicant>();
    	applicantsList.addAll(set);
    }

    //interface method - Part B
    public int maxSubmissionsDay() {
    	int scount = 0;
    	int wcount = 0;
    	int max = 0;
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	Iterator<Applicant> ite = applicantIterator();
        while(ite.hasNext()) {
        	Applicant applicant = ite.next();
        	map.put(applicant.getAppliedDay(), ++scount);
        	//map.put(applicant.getWithdrawnDay(), --wcount);
        }
        for (Integer value : map.values()) {
            if(value > max) max = value;
        }
        return max;
    }

}

