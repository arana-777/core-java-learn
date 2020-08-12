package oops_concepts;

public class StudentClass {
	String name;
	int rollno;
	int age;
	
	void info() {
		System.out.println("Name: " + name);
		System.out.println("Roll no: " + rollno);
		System.out.println("Age: " + age);
	}
	
	public static void main(String[] args) {
		StudentClass student1 = new StudentClass();
		
		student1.name = "John";
		student1.rollno = 24;
		student1.age = 16;
		
		// calling class method to see values
		student1.info();
		
	}
}
