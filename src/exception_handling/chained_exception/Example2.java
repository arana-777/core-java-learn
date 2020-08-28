package exception_handling.chained_exception;

public class Example2 {
	public static void main(String[] args) {
		try {
			NumberFormatException a = new NumberFormatException("====> Main Called Exception");
			a.initCause(new NullPointerException("====> Actual cause of Exception"));
			throw a;
		} catch (NumberFormatException a) {
			System.out.println(a);
			System.out.println(a.getCause());
		}
	}
}
