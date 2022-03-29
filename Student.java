package assignment2;

public class Student {//Model class.

	//Declaration of data fields
	private int ID;
	private String name;
	private double math;
	private double science;
	
	
	public Student() {//Non arguments constructor 
	}

	public Student(int iD, String name, double math, double science) {//Constructor with arguments
		super();
		ID = iD;
		this.name = name;
		this.math = math;
		this.science = science;
	}

	//Getters and setters
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getScience() {
		return science;
	}

	public void setScience(double science) {
		this.science = science;
	}
	
	
	
}
