package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestAl {
	
	
		public static void main(String[] args) 
		{
			
			Employee e1 = new Employee(105,"Rohit",34000);
			Employee e2 = new Employee(101,"Atharv",54000);
			Employee e3 = new Employee(102,"Josh",4000);
			Employee e4 = new Employee(10,"Ashish",74000);
			
			ArrayList <Employee> l1 = new ArrayList <Employee> ();
			
			l1.add(e1);
			l1.add(e2);
			l1.add(e3);
			l1.add(e4);
//			System.out.println("Before Sorting ");
//			System.out.println(l1);
//			
//			
			Scanner sc = new Scanner(System.in);
			int choice;
			
			do
			{
				System.out.println("\n========== EMPLOYEE SORTING SYSTEM ==========\n\n");
	            System.out.println("1. To SORT BY ID");
	            System.out.println("2. To SORT BY NAME");
	            System.out.println("3. To SORT BY SALARY");
	            System.out.println("4. To DISPLAY EMPLOYEES");
	            System.out.println("5. To STOP THE LOOP OR EXIT");
	            
	            System.out.print("\nEnter your choice : ");

	            choice = sc.nextInt();

	            switch(choice)
	            {
	            	case 1:
	            		MyIdComparator midc =  new MyIdComparator();
	            		Collections.sort(l1,midc);
	            		System.out.println("After Sorting by ID ");
	            		System.out.println(l1);
	            		break;
	            	case 2:
	            		MyNameComparator mnc =  new MyNameComparator();
	            		Collections.sort(l1,mnc);
	            		System.out.println("After sorting by Name \n");
	            		System.out.println(l1);
	            		break;
	            		
	            	case 3:

	            		MySalaryComparator msc =  new MySalaryComparator();
	            		Collections.sort(l1,msc);
	            		System.out.println("After sorting by Salary \n");
	            		System.out.println(l1);
	            		break;
	            		
	            	case 4:
	            		System.out.println(l1);
	            		break;
	            		
	            	case 5:
	            		System.out.println("Exiting Application !!");
	            		break;
	            		
	            	default :
	            		System.out.println("Invalid choice ");
	            		break;
	            }
	            //break;
			}while(choice != 5);

		
		}//main ends here
		
	}//class TestEmployee ends here	}



