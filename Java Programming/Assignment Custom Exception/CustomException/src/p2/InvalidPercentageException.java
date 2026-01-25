package p2;

public class InvalidPercentageException  extends Exception {
	
		InvalidPercentageException(String msg) {
		super(msg);
	}

		@Override
	    public String toString() {
	        return "Percentage must be between 0 and 100!";
	    }

}
