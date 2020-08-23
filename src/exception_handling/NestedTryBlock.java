package exception_handling;

public class NestedTryBlock {
	public static void main(String[] args) {
		try {
			int arr[] = { 5,0,1,2 };
			try {
				int x = arr[3] / arr[1];
				System.out.println(x);
			} catch (ArithmeticException e) {
				System.out.println("divide by zero exception");
			}
			arr[4] = 40;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bounds exception");
		}
	}
}
