package p2;

public class UnderageException extends Exception {
	public UnderageException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}

	@Override
    public String toString() {
        return "Age must be 17 or above!";
    }
}



