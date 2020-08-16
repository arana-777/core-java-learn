package oops_concepts.method_overloading;

class Calculate {
	void sum(int a, int b) {
		System.out.println("Sum is : " + (a+b));
	}
	void sum(float a, float b) {
		System.out.println("Sum is : " + (a+b));
	}
}
public class DifferentArgumentType {
	public static void main(String[] args) {
		Calculate calc = new Calculate();
		calc.sum(20, 99);
		calc.sum(4.6f, 3.8f);
	}
}
