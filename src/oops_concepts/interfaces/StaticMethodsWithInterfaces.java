package oops_concepts.interfaces;

interface Abc {
	static void msg() {
		System.out.println("This is static method in interface.");
	}
	void greet(String msg);
}
class Demo1 implements Abc {
	public void greet(String msg) {
		System.out.println(msg);
	}
}
public class StaticMethodsWithInterfaces {
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		Abc.msg();
		d.greet("Hello there!");
	}
}
