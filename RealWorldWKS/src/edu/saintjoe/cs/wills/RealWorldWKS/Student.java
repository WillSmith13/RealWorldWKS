package edu.saintjoe.cs.wills.RealWorldWKS;

public class Student {
	String name;
	int age;
	String gender;
	int classYr;
	
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
	

}
