package p1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args) {
		File f1 = new File("Demo.txt");
		try {
			System.out.println(f1.createNewFile());
			FileWriter fw1= new FileWriter(f1, true);
			fw1.write("Learing File Handling");
			fw1.close();
			System.out.println("Written successfully");
		}catch (IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
