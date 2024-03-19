package in.fundamentals;

class Student{
	int studentId;
	String studentName;
	
	Student(int id,String name){
		studentId =id;
		studentName = name;
	}
	
	public void showDetails(){
		System.out.println("Id:"+studentId+" Name :"+studentName);
	}
}
public class Constructor_II {

	public static void main(String[] args) {
		Student s1 =new Student(101, "Aayush");
		Student s2 =new Student(102, "Harsh");
		s1.showDetails();
		s2.showDetails();
	}

}
