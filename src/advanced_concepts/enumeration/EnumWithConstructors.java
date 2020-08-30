package advanced_concepts.enumeration;

enum Student {
	John(11, "John"), Bella(10, "Bella"), Sam(14, "Same");
	private int age;
	private String name;
	
	int getage() { return age; }
	String getname() { return name; }
	
	private Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
}
public class EnumWithConstructors {
	public static void main(String[] args) {
		Student s;
		System.out.println("Student 1 details are : name=" + Student.John.getname() + ", age=" + Student.John.getage());
		System.out.println("Student 2 details are : name=" + Student.Bella.getname() + ", age=" + Student.Bella.getage());
		System.out.println("Student 3 details are : name=" + Student.Sam.getname() + ", age=" + Student.Sam.getage());
		
	}
}
