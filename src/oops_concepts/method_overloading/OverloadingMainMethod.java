package oops_concepts.method_overloading;

public class OverloadingMainMethod {
	public static void main(int args) {
		System.out.println("Main method with int argument Executing");
		System.out.println(args);
	}
	public static void main(char args) {
		System.out.println("Main method with char argument Executing");
		System.out.println(args);
	}
	public static void main(Double[] args) {
		System.out.println("Main method with double arguments Executing");
		System.out.println(args);
	}
	public static void main(String[] args) {
		OverloadingMainMethod.main(12);
		OverloadingMainMethod.main('c');
		OverloadingMainMethod.main(123456);
		
	}
}
