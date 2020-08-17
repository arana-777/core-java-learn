package oops_concepts.method_overriding;

class Animal {
	public void eat() {
		System.out.println("Eat all eatables...");
	}
}
class Dog extends Animal {
	public void eat() {
		System.out.println("Dog like to eat meat");
	}
}
public class Example {
	public static void main(String[] args) {
		Dog doggo = new Dog();
		doggo.eat();
	}
}
