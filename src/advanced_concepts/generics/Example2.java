package advanced_concepts.generics;

class Student <T1, T2> {
	T1 name;
	T2 age;
	
	Student(T1 n, T2 a) {
		this.name = n;
		this.age = a;
	}
	
	public T1 getName() { return this.name;	}
	public T2 getAge() { return this.age; }
}
public class Example2 {
	public static void main(String[] args) {
		Student <String, Integer> s1 = new Student<>("John",25);
		
		String name = s1.getName();
		int age = s1.getAge();
		System.out.println("Student details, name: " + name + ", age: " + age);
	}
}
