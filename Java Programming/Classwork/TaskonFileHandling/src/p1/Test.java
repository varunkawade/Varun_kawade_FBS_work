package p1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		File f1 = new File("FirstName.txt");
		File f2=new File("LastName.txt");
		 ArrayList<String>a1=new ArrayList<>();
		 ArrayList<String>a2=new ArrayList<>();
		 ArrayList<String> fullNames = new ArrayList<>();
	     
		try {
			Scanner sc1 = new Scanner(f1);
            while (sc1.hasNextLine()) {
                a1.add(sc1.nextLine().trim());
            }
            sc1.close();

            Scanner sc2 = new Scanner(f2);
            while (sc2.hasNextLine()) {
                a2.add(sc2.nextLine().trim());
            }
            sc2.close();

            int size = Math.min(a1.size(), a2.size());
            for (int i = 0; i < size; i++) {
                fullNames.add(a1.get(i) + " " + a2.get(i));
            }

            for (String name : fullNames) {
                System.out.println(name);
            }

		}catch (IOException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
	   }
	}
}