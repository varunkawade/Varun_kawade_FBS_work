package p1;

public class test {
	public static void main(String[] args) {
		voter v1 = new voter(19);
		try {
			v1.validate();
		} catch (InvalidaAgeExcpetion e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
