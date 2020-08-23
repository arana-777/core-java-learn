package exception_handling;

class Test_throw {
	static void avg() {
		try {
			throw new ArithmeticException("demo exception");
		} catch (ArithmeticException e) {
			System.out.println("Exception caught from demo exception block in avg() method");
		}
	}
}
public class ThrowExceptionExample {
	public static void main(String[] args) {
		Test_throw.avg();
	}
}
