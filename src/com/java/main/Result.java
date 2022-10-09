package com.java.main;

import com.java.model.Student;
import com.java.model.StudentResult;

public class Result {
	public static void main(String[] args) {
		Student student=new Student();
		student.setRollno(1);
		student.setSaddress("pne");
		student.setSname("Amit");
		student.getSrobj();
		System.out.println(student);
		StudentResult r=new StudentResult();
		
		System.out.println(r.getResult());
	}
}
 
