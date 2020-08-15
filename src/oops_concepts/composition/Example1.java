package oops_concepts.composition;

class Engine {
	String companyName;
	String make;
	int age;
	Engine(String name, String make, int age) {
		this.companyName = name;
		this.make = make;
		this.age = age;
	}
}
class Car { 
	private Engine engine;
	String name;
	int year;
	Car(Engine en, String name, int year) {
		this.engine = en;
		this.name = name;
		this.year = year;
	}
	
	public void display() {
		System.out.println("Car name: " + this.name);
		System.out.println("Car year: " + this.year);
		System.out.println("Engine make: " + this.engine.make);
		System.out.println("Engine age: " + this.engine.age);
	}
}
public class Example1 {
	public static void main(String[] args) {
		Engine en = new Engine("Fiat", "2017-D", 3);
		Car car = new Car(en, "Dzire", 2018);
		
		car.display();
		
		
		
	}
}
