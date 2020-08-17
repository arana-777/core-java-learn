package oops_concepts.method_overriding;

class Parent { }

class Child extends Parent {
	public void check() {
		System.out.println("Successfull downcasting.");
	}
	
	public static void show(Parent p) {
		if (p instanceof Child) {
			Child b1 = (Child)p;
			b1.check();
		}
	}
}
public class Downcasting {
	public static void main(String[] args) {
		Parent p = new Child();
		Child.show(p);
	}
}
