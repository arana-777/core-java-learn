package oops_concepts.method_overloading;

class Calculate1 {
	void multiply(int l, int b) {
		System.out.println("Result is : " + (l*b));
	}
	void multiply(int l, int b, int h) {
		System.out.println("Result is : " + (l*b*h));
	}
}
public class DifferentArgumentNumbers {
	public static void main(String[] args) {
		Calculate1 calc = new Calculate1();
		calc.multiply(8, 5);
		calc.multiply(4, 6, 2);
	}
}
