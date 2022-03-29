package assignment2;

import java.sql.*;

public class StudentCTRL {//Controller class
	private Student model;
	private StudentUI view;
	
	public StudentCTRL() {
	}
	
	public StudentCTRL(Student model, StudentUI view) {
		this.model = model;
		this.view = view;
	}
	
	public void retrieveStudentDetails(int ID) throws SQLException{//method to get data from MySQL database 
		Student student = new Student();

		//connecting to MySQL driver
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "207273207273");
		
		//MySQL statement
		String sql = "SELECT * FROM STUDENT WHERE STUDENTID ='" + ID + "'";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		if(rs.next()) {
			student.setID(rs.getInt("STUDENTID"));
			student.setName(rs.getString("NAME"));
			student.setMath(rs.getDouble("MATH"));
			student.setScience(rs.getDouble("SCIENCE"));
		}
		
		view.displayStudentDetails(student.getID(), student.getName(), student.getMath(), student.getScience());
	}
	
	//method to insert data into MySQL database
	public void setStudentDetails(int ID, String name, double math, double science) throws SQLException {
		Student student = new Student();
	
		//connecting to MySQL driver
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "207273207273");
		Statement stmt = conn.createStatement();
		
		//MySQL statement
		stmt.executeUpdate("INSERT INTO STUDENT VALUES(" + ID + ", '" + name + "', " + math + ", " + science + ")");
		System.out.println("Input Successfully!");
	}
}
