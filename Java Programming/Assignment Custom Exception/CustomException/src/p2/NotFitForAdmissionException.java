package p2;

public class NotFitForAdmissionException extends Exception {

	 NotFitForAdmissionException(String msg) {
		super(msg);
	}

	 @Override
	    public String toString() {
	        return "Student not fit for admission!";
	    }
}
