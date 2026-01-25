package p2;

public class Test {
	
	    public static void main(String[] args) {

	        AdmissionForm form =
	                new AdmissionForm("Varun", 18,70,5000,2000);

	        try {
	            form.validateForm();
	            System.out.println("Admission Successful!");
	        }
	        catch (EmptyNameException e) {
	            System.out.println(e.getMessage());
	        }
	        catch (UnderageException e) {
	            System.out.println(e.getMessage());
	        }
	        catch (InvalidPercentageException e) {
	            System.out.println(e.getMessage());
	        }
	        catch (NotFitForAdmissionException e) {
	            System.out.println(e.getMessage());
	        }
	        catch (FeesNotPaidException e) {
	            System.out.println(e.getMessage());
	        }
	        catch (InsufficientFeesException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}



