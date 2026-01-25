package p2;

public class AdmissionForm {
	
	    String studentName;
	    int age;
	    double percentage;
	    double courseFees;
	    double feesPaid;

	    AdmissionForm(String studentName, int age, double percentage,
	                  double courseFees, double feesPaid) {
	        this.studentName = studentName;
	        this.age = age;
	        this.percentage = percentage;
	        this.courseFees = courseFees;
	        this.feesPaid = feesPaid;
	    }

	    public void validateForm() throws EmptyNameException,
	            UnderageException,
	            InvalidPercentageException,
	            NotFitForAdmissionException,
	            FeesNotPaidException,
	            InsufficientFeesException {

	        if (studentName == null || studentName.trim().isEmpty()) {
	            throw new EmptyNameException();
	        }

	        if (age < 17) {
	            throw new UnderageException("Age must be 17 or above!");
	        }

	        if (percentage < 0 || percentage > 100) {
	            throw new InvalidPercentageException("Percentage must be between 0 and 100!");
	        }

	        if (percentage < 35) {
	            throw new NotFitForAdmissionException("Student not fit for admission!");
	        }

	        if (feesPaid == 0) {
	            throw new FeesNotPaidException("Fees Not Paid!");
	        }

	        if (feesPaid < (0.30 * courseFees)) {
	            throw new InsufficientFeesException("At least 30% fees must be paid!");
	        }
	    }
	}



