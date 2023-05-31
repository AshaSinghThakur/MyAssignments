package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Called studentName() from Student ");
	}
	public void studentDept() {
		// TODO Auto-generated method stub
System.out.println("Called studentDept() from Student ");
	}
	public void studentId() {
		// TODO Auto-generated method stub
System.out.println("Called studentId() from Student");
	}
	public static void main(String[] args) {
		Student st=new Student();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		st.deptName();
		st.studentDept();
		st.studentId();
		st.studentName();
	
	}
}
