package com.encapsulation;

class Course{
	private int courseId;
	private String courseName;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + "]";
	}
	
	
}

public class Test {

	public static void main(String[] args) {
		Course c1 = new Course();
		c1.setCourseId(1001);
		c1.setCourseName("Java");
		System.out.println(c1);
		System.out.println(c1.getCourseId());
		System.out.println(c1.getCourseName());

	}

}
