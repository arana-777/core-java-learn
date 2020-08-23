package exception_handling;

public class MutlipleCatchExample2 {
	public static void main(String[] args) {
		try {
			int a[] = new int[10];
			System.out.println(a[30]);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception --> " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception --> " + e);
		} catch (Exception e) {
			System.out.println("Exception --> " + e);
		}
	}
}
