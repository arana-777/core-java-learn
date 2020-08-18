package oops_concepts.interfaces;

interface Xyz {
	// default method
	default void msg() {
		greet();
	}
	// private method
	private void greet() {
		System.out.println("This is a private method of interface.");
	}
}
class Demo2 implements Xyz {
	int number = 20;
}
public class PrivateMethodWithInterfaces {
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		System.out.println(d.number);
		d.msg();
	}
}
