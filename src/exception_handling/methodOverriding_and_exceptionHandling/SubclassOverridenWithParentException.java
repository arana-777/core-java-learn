package exception_handling.methodOverriding_and_exceptionHandling;

class Parent {
	void pShow() throws ArithmeticException {
		System.out.println("parent class");
	}
}

class Child extends Parent {
	// below will give compile time error
//	void pShow() throws Exception {
//		System.out.println("child class");
//	}
}
public class SubclassOverridenWithParentException {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.pShow();
	}
}
