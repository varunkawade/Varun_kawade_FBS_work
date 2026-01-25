package fileDemo;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestFileDemo {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileOutputStream fos=new FileOutputStream("MaData.text");
			//DataOutputStream dos= new DataOutputStream(fos);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(new Employee(101,"Sachin",23000));
			
			System.out.println("Written Successfully");
			}
		catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

class ReadDemo{
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("MaData.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee e1 = (Employee)ois.readObject();
		}
		catch(FileNotFoundException e) {
			// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			
		}
	}


