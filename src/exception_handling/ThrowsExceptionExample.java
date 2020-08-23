package exception_handling;

class TestThrows {
	static void check() throws ArithmeticException {
		System.out.println("Inside check function");
		throw new ArithmeticException("Demo");
	}
}
public class ThrowsExceptionExample {
	public static void main(String[] args) {
		try {
			TestThrows.check();
		} catch (ArithmeticException e) {
			System.out.println("Caught: " + e);
		}
	}
}
