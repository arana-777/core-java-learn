package oops_concepts.method_overriding;

class Animal1 {
	Animal1 getObj() {
		System.out.println("Animal object");
		return new Animal1();
	}
}
class Dog1 extends Animal1 {
	Dog1 getObj() {
		System.out.println("Dog object");
		return new Dog1();
	}
}
public class ReturnTypeOverride {
	public static void main(String[] args) {
		new Animal1().getObj();
		new Dog1().getObj();
	}
}
