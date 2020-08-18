package oops_concepts.interfaces;

interface ABC {
	// default method
	default void msg() {
		System.out.println("This is default method");
	}
	// Abstract method
	void greet(String msg);
}
class Demo implements ABC {
	public void greet(String msg) {
		System.out.println(msg);
	}
}
public class DefaultMethodWithInterfaces {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.msg();
		d.greet("Say Hi.");
	}
}
