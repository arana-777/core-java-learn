package oops_concepts.abstract_class;
//Abstract class with non-abstract method

abstract class A1 {
	abstract void callme();
	public void show() {
		System.out.println("This is non-abstract method defined in class A1.");
	}
}

class B1 extends A1 {
	void callme() {
		System.out.println("Calling(from B1)...");
	}
}
public class Example2 {
	public static void main(String[] args) {
		B1 b = new B1();
		b.callme();
		b.show();
	}
}
