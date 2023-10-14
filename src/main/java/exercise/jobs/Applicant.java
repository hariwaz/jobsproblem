package exercise.jobs;

import java.util.Objects;

/**
 *
 * The job applicant and his/her submission
 *
 */
public class Applicant {
    private String first;
    private String last;

    private int appliedDay;
    private int withdrawnDay;

    public Applicant(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public Applicant(String first, String last, int appliedDay, int withdrawnDay) {
        this(first, last);
        this.appliedDay = appliedDay;
        this.withdrawnDay = withdrawnDay;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public int getAppliedDay() {
        return appliedDay;
    }

    public int getWithdrawnDay() {
        return withdrawnDay;
    }

	@Override
	public int hashCode() {
		return Objects.hash(first, last);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Applicant other = (Applicant) obj;
		return Objects.equals(first, other.first) && Objects.equals(last, other.last);
	}
    
    

}
