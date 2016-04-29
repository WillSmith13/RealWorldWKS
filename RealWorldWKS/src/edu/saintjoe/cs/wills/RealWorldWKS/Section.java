package edu.saintjoe.cs.wills.RealWorldWKS;

public class Section {

	    public static final int MAXSTUDENTS = 25;
		
		public static String[] classYrNames = {"ImpossibleClassYear", "Freshman", "Sophomore", "Junior", "Senior", "Special"};
		
		private String room;
		private String teacher;
		private String title;
		private Student[] students;
		
		public Section (String newTitle, String newTeacher, String newRoom) {
			students = new Student[MAXSTUDENTS];
			title = newTitle;
			teacher = newTeacher;
			room = newRoom;
		}
		// Mutator put in for sake of my CMP112 students 
		public void setStudent(Student newStudent, int whereAt) {
			// An important test is needed!!!
			if (whereAt > (MAXSTUDENTS - 1)) {
				System.out.println("You are a major idiot!");
				return;
		}
			students[whereAt] = newStudent;
		
}
		
		
		public String toString() {
			
			String output = "";
			output = "Class information for " + title + " taught by: " + teacher + " meeting in Room: " + room + "\n";
			
			for (Student oneStudent: students) {
				if (oneStudent == null)
					break;
				output += oneStudent.getName() + " " + oneStudent.setGender() + " " + classYrNames[oneStudent.getClassYr()] + " " + oneStudent.getAge() + "\n";
				}
			return output;
		}
	
	
	
}
