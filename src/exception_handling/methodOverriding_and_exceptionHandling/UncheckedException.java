package exception_handling.methodOverriding_and_exceptionHandling;

class Super {
	void show() {
		System.out.println("parent class");
	}
}

class Sub extends Super {
	void show() throws ArrayIndexOutOfBoundsException {
		System.out.println("child class");
	}
}
public class UncheckedException {
	public static void main(String[] args) {
		Super s = new Sub();
		s.show();
	}
}
