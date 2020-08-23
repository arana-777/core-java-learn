package exception_handling;

public class UnreachableCatchBlockExample {
	public static void main(String[] args) {
		try {
			int arr[] = {1,2};
			arr[2] = 100;
		} catch (Exception e) {
			System.out.println("Generic exception: " + e);
		}
		/*
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bound exception");
		}
		*/
	}
}
