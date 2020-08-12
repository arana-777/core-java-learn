package oops_concepts;

class Demo {
	Demo() {
		this(10);
		System.out.println("******Default constructor******");
	}
	
	Demo(int x) {
		this(3,4);
		System.out.println("******Inside constructor with 1 parameter******");
		System.out.println("x="+x);
		
	}
	Demo (int x, int y) {
		System.out.println("******Inside constructor with 2 parameters******");
		System.out.println("x="+x+", y="+y);
	}
}
public class ConstructorChaining {
	public static void main(String[] args) {
		Demo obj = new Demo();
		
	}
}
