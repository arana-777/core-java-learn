package exception_handling.chained_exception;

import java.io.IOException;

class ChainedException1 {
	public static void divide(int a, int b) {
		if (b == 0) {
			ArithmeticException ae = new ArithmeticException("Arithmetic Exception @ top layer");
			ae.initCause(new IOException("IO Exception @ cause layer ==> user input value for " + b + " is zero"));
			throw ae;
		} else {
			System.out.println("Division of a/b , result: " + (a/b));
		}
	}
}
public class Example1 {
	public static void main(String[] args) {
		try {
			ChainedException1.divide(5, 0);
		} catch (ArithmeticException ae) {
			System.out.println("Caught : " + ae);
			System.out.println("Actual cause: " + ae.getCause());
		}
	}
}
