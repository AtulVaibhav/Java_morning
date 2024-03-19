package com.inheritanceII;

import java.util.ArrayList;
import java.util.List;

class Student{
	private int studentId;
	private String studentName;
	private List<Course> courses;
	public Student(int studentId, String studentName, List<Course> courses) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", courses=" + courses + "]";
	}	
}

class Course{
	private int courseId;
	private String courseName;
	public Course(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + "]";
	}
	
	
}


public class AssociationTest {

	public static void main(String[] args) {
		Course c1 = new Course(101,"Java");
		Course c2 = new Course(102,"C++");
		
		List<Course> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        
        
        Student s1 = new Student(10001,"Harsh",list);
        System.out.println(s1);
        
	}

}
