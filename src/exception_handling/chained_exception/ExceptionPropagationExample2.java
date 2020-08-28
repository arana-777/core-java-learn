package exception_handling.chained_exception;
import java.io.IOException;

class Demo2 {
	void m1() throws IOException {
		throw new IOException("device error");
	}
	void n1() throws IOException {
		m1();
	}
	void p1() {
		try {
			n1();
		} catch (Exception e) {
			System.out.println("Exception handled: "+ e);
		}
	}
}
public class ExceptionPropagationExample2 {
	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		obj.p1();
	}
}
