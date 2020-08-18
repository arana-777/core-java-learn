package oops_concepts.nested_classes;

class Outer {
	public void display() {
		Inner in = new Inner();
		in.show();
	}
	// inner class defined within a class
	class Inner {
		public void show() {
			System.out.println("Inside inner");
		}
	}
}
public class ExampleInnerClass {
	public static void main(String[] args) {
		Outer ot = new Outer();
		ot.display();
	}
}
