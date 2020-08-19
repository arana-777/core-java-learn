package oops_concepts.nested_classes;

// Example of Inner class instantiated outside Outer class
class Outer3 {
	int count;
	public void display() {
		Inner3 in = new Inner3();
		in.show();
	}
	
	class Inner3 {
		public void show() {
			System.out.println("Inside inner class: " + (++count));
		}
	}
}
public class InnerClassCalledOutsideOuterClass {
	public static void main(String[] args) {
		Outer3 ot = new Outer3();
		Outer3.Inner3 in = ot.new Inner3();
		in.show();
		ot.display();
		in.show();
	}
}
