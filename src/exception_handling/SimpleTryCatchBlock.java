package exception_handling;

public class SimpleTryCatchBlock {
	public static void main(String[] args) {
		int a,b,c;
		try {
			a = 0;
			b = 10;
			c = b/a;
			System.out.println("This line will not be excuted: " + c);
		} catch (ArithmeticException e) {
			System.out.println("Exception: Divide by zero.");
		}
		System.out.println("After exception is handled");
	}
}
