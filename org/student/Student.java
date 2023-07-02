package org.student;

import org.college.College;

public class Student extends College {

	public void studentName() {
		System.out.println("Elakkiya S");
		
	}
	public void studentDept() {
		System.out.println("BA");
	}
	public void studentId() {
		System.out.println("1121");
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
	}
}
