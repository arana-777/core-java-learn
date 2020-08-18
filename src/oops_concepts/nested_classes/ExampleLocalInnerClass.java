package oops_concepts.nested_classes;

class Outer1 {
	int count;
	public void display() {
		for (int i=0; i<5; i++) {
			// inner class defined inside for-loop
			class Inner1 {
				public void show() {
					System.out.println("Inside inner : " + (count++));
				}
			}
			Inner1 in = new Inner1();
			in.show();
		}
	}
}
public class ExampleLocalInnerClass {
	public static void main(String[] args) {
		Outer1 ot = new Outer1();
		ot.display();
	}
}
