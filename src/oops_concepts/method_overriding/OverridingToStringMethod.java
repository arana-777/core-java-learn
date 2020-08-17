package oops_concepts.method_overriding;

class Demo {
	private double a, b;
	public Demo(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public String toString() {
		return String.format(a + " + i" + b);
	}
}
public class OverridingToStringMethod {
	public static void main(String[] args) {
		Demo obj1 = new Demo(25, 100);
		System.out.println(obj1);
	}
}
