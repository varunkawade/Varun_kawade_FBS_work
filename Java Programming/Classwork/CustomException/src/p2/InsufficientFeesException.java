package p2;

public class InsufficientFeesException extends Exception 
{
	 InsufficientFeesException(String msg) {
		super(msg);
	}

	 @Override
	    public String toString() {
	        return "At least 30% fees must be paid!";
	    }
	

}
