package text1;

import java.util.List;

public class school {
	private List<teacher> teachers;
	private List<student> students;  
	private static int totalmoneyearned;
	private static int totalmoneyspent;
	public school(List<teacher> teachers, List<student> students) {
	this.teachers = teachers;
	this.students = students;
	totalmoneyearned=0;
	totalmoneyspent=0; 
	}
	
	public List<teacher> getteachers() {
		return teachers;
	}

	public void addteacher(teacher teacher) {
		teachers.add(teacher);
	} 

	public List<student> getstudents() {
		return students;
	}

	public void addstudent(student student) {
		students.add(student);
	}

	public static int gettotalmoneyearned() {
		return totalmoneyearned;
	}

	public static int gettotalmoneyspent() {
		return totalmoneyspent;
	}
	public static void updatetotalmoneyearned(int moneyearned) {
		totalmoneyearned += moneyearned;
	}
	public static void updatetotalmoneyspent(int moneyspent) {
		totalmoneyspent += moneyspent;
	}

} 

