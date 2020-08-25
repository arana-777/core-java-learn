package exception_handling.custom_exception;

class MyException extends Exception {
	private int ex;
	MyException(int a) {
		ex = a;
	}
	public String toString() {
		return "MyException[" + ex + "] is less than zero";
	}
}

class Demo2 {
	static void sum(int a, int b) throws MyException {
		if (a<0) {
			throw new MyException(a); // calling constructor of user-defined exception class
		} else {
			System.out.println("Sum is : " + (a+b));
		}
	}
}
public class Example2 {
	public static void main(String[] args) {
		try {
			Demo2.sum(-10, 20);
		} catch (MyException me) {
			System.out.println(me);
		}
	}
}
