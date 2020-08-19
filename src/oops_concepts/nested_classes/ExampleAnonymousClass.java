package oops_concepts.nested_classes;

interface Animal {
	void type();
}

public class ExampleAnonymousClass {
	public static void main(String[] args) {
		// Anonymous class created
		Animal an = new Animal() {
			public void type() {
				System.out.println("Anonymous animal");
			}
		};
		an.type();
		System.out.println(an);
	}
}
