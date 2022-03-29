package assignment2;

import java.sql.*;
import java.util.Scanner;

public class Application {//Main class

	public static void main(String[] args) throws SQLException {//Main method
		Scanner sc = new Scanner(System.in);
		StudentUI view = new StudentUI();
		
		System.out.print("1. Set Student Details. \n2. Check Student Details. \nSelect option: ");
		int option = sc.nextInt();
		
		view.menu(option);//invoking menu to be displayed in console
	}

}
