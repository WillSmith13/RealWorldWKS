package edu.saintjoe.cs.wills.RealWorldWKS;

public class Student {
	private String name;
	private int age;
	private String gender;
	private int classYr;
	
	public Student(String newName, String newGender, int newClassYr, int newAge) {
		name = newName;
		gender = newGender;
		classYr = newClassYr;
		age = newAge;
		
	}

		public void setName(String newName) {
			name = newName;
		}
	
	public String getName() { 
		return name;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public int getAge() {
		return age;
	}

	public void setGender(String newGender) {
		gender = newGender;
	}
	
	public String setGender() {
		return gender;
	}

	public void setClassYr(int year) {
		classYr = year;
	}
	
	public int getClassYr() {
		return classYr;
	}
	
	
	
}
