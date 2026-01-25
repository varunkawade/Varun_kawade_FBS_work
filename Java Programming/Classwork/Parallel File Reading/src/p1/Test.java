package p1;
import java.io.File;
public class Test {
	public static void main(String[] args) {
		File fName=new File("firstName.txt");
		try {
			fName.createNewFile();
		} catch (Exception e) {
			// TODO: handle exception
		   e.printStackTrace();
		}
		File lName=new File("LastName.txt");
		try {
			lName.createNewFile();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		FirstNameReader fr= new FirstNameReader(fName);
		LastNameReader lr= new LastNameReader(lName);
		
		fr.start();
		lr.start();
		
	}

}
