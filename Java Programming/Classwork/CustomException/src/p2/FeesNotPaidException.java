package p2;

public class FeesNotPaidException extends Exception {
	 public FeesNotPaidException(String msg) {
	        super(msg);
	    }

	public String toString() {
        return "Fees not paid!";
    }

}
