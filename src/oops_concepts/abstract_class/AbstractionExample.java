package oops_concepts.abstract_class;

// Abstraction using Abstract class
abstract class Vehicle {
	public abstract void engine();
}
class Car extends Vehicle {
	public void engine() {
		System.out.println("Car Engine");
	}
}
public class AbstractionExample {
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.engine();
	}
}
