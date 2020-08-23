package exception_handling;

public class FinallyBlockExample {
	public static void main(String[] args) {
		int a[] = new int[2];
		System.out.println("Out of try");
		try {
			System.out.println("Access invalid element in array: "+ a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of bounds exception.");
		} finally {
			System.out.println("Finally block is always executed.");
		}
	}
}
