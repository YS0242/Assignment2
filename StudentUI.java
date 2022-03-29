package assignment2;

import java.util.Scanner;
import java.sql.SQLException;

public class StudentUI {//View class

	public void menu (int option) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		StudentCTRL ctrl = new StudentCTRL(student, this);
		
		if(option == 1) {//Selection to determine the service by program
			try {
				System.out.println("Enter student details.");
				System.out.println("___________________________________________________________");
			
				System.out.print("Student ID : ");
				int ID = sc.nextInt();
			
				System.out.print("\nStudent Name : ");
				String name = sc.next();
			
				System.out.print("\nMath Mark : ");
				double math = sc.nextDouble();
			
				System.out.print("\nScience Mark : ");
				double science = sc.nextDouble();
			
				//triggering controller to input data into MySQL database
				ctrl.setStudentDetails(ID, name, math, science);
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	
		
		else if (option == 2){//Selection to determine the service by program
			System.out.println("Display student details.");
			System.out.println("____________________________________________________________");
			System.out.println("Insert Student ID : ");
			int ID = sc.nextInt();
			try {
				//triggering controller to retrieve data from MySQL database
				ctrl.retrieveStudentDetails(ID);
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
	
	}
	
	public void displayStudentDetails(int ID, String name, double math, double science) {
		System.out.println("Student details.");
		System.out.println("____________________________________________________________");
		System.out.println("Student ID : " + ID);
		System.out.println("Student Name : " + name);
		System.out.println("Math Mark : " + math);
		System.out.println("Science Mark : " + science);
		
	}
	
}
