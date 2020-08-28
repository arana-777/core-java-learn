package exception_handling.chained_exception;

class ExpDemo1 {
	void a1() {
		int data = 30 / 0;
	}
	void a2() {
		a1();
	}
	void a3() {
		try {
			a2();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
public class ExceptionPropagationExample1 {
	public static void main(String[] args) {
		ExpDemo1 obj1 = new ExpDemo1();
		obj1.a3();
	}
}
