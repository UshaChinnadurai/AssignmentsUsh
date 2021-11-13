package week3Assignments2.org.student;

import week3Assignments2.org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student Name:Qwerty");

	}
	
	public void studentDept() {
		System.out.println("Student Department:CSE");

	}
	
	public void studentId() {
		System.out.println("Student id:44");

	}
	
	public static void main(String[] args) {
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
	}

}
