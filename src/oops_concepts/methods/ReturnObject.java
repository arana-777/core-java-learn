package oops_concepts.methods;

class Demo {
	int multi;
	double div;
	int add;
	
	// class constructor
	Demo(int a, double b, int c) {
		multi = a;
		div = b;
		add = c;
	}
}

public class ReturnObject {
	static Demo get_values(int x, int y) {
		return new Demo(x*y, (double)x/y, x+y);
	}
	
	public static void main(String[] args) {
		Demo ans = get_values(120, 40);
		System.out.println("Multiplication value: " + ans.multi);
		System.out.println("Division value: " + ans.div);
		System.out.println("Addtion value: " + ans.add);
	}
}
