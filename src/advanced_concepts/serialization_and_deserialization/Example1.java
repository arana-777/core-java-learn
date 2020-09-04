package advanced_concepts.serialization_and_deserialization;

import java.io.*;

class Person implements Serializable {
	private String name;
	private int age;
	private String gender;
	
	Person() { }
	
	Person(String n, int a, String g) {
		this.name = n;
		this.age = a;
		this.gender = g;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + "\nAge: " + this.age + "\nGender: " + this.gender;
	}
}
public class Example1 {
	public static void main(String[] args) {
		Person p1 = new Person("John", 30, "Male");
		Person p2 = new Person("Rachel", 25, "Female");
		
		try {
			File fl = new File("/home/arana/eclipse-workspace/core-java-learn/resources/object_text.txt");
			FileOutputStream fos = new FileOutputStream(fl);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			// write objects to file
			oos.writeObject(p1);
			oos.writeObject(p2);
			
			oos.close();
			fos.close();
			
			// reading objects now
			
			FileInputStream fis = new FileInputStream(fl);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Person pr1 = (Person)ois.readObject();
			Person pr2 = (Person)ois.readObject();
			
			System.out.println(pr1.toString());
			System.out.println(pr2.toString());
			
		} catch(FileNotFoundException fe) {
			System.out.println("File not found");
		} catch (IOException ie) {
			System.out.println("Error initializing stream");
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}
	}
}
