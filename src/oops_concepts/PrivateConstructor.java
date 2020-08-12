package oops_concepts;

final class abc {
	
	private abc() {}
	
	public static void add(int a, int b) {
		int z = a + b;
		System.out.println("Addition: " + z);
	}
	
	public static void sub(int x, int y) {
		int z = x - y;
		System.out.println("Subtraction: " + z);
	}
}
public class PrivateConstructor {
	public static void main(String[] args) {
		abc.add(10, 20);
		abc.sub(15, 19);
	}
}
