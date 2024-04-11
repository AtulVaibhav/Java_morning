package com.comparableInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	private int studentId;
	private String studentName;
	private String studentAge;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}
	@Override
	public int compareTo(Student s) {
		return this.studentAge.compareTo(s.studentAge);
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}
	
	
	
}


public class Test {

	public static void main(String[] args) {
		Student s1 = new Student(1,"Harsh","24");
		Student s2 = new Student(2,"Vivek","34");
		Student s3 = new Student(3,"Vishal","21");
		Student s4 = new Student(4,"Amit","26");
		Student s5 = new Student(5,"Ankur","45");
		Student s6 = new Student(6,"Joe","31");
		
		List<Student> list = Arrays.asList(s1,s2,s3,s4,s5,s6);
		Collections.sort(list);
		System.out.println(list);

	}

}
