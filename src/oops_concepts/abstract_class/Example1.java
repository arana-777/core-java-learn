package oops_concepts.abstract_class;

abstract class A {
	abstract void callme();
}

class B extends A {
	void callme() {
		System.out.println("Calling(for B)...");
	}
}
public class Example1 {
	public static void main(String[] args) {
		B b = new B();
		b.callme();
	}
}
