package exception_handling;

public class MutlipleCatchExample1 {
	public static void main(String[] args) {
		try {
			Integer in = new Integer("abc");
			in.intValue();
		} catch (ArithmeticException e) {
			System.out.println("Arithematic: " + e);
		} catch (NumberFormatException e) {
			System.out.println("Number format exception: " + e);
		}
	}
}
