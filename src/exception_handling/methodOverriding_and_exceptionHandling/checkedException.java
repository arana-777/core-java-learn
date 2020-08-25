package exception_handling.methodOverriding_and_exceptionHandling;

class SuperChecked {
	void show() {
		System.out.println("parent class");
	}
}

class SubChecked extends SuperChecked {
	
	// below will generate compile time error
	// we cannot extend checked exception like IOException in child class 
	// for parent inherited method
	
//	void show() extends IOException {  
//		System.out.println("child class");
//	}
}
public class checkedException {
	public static void main(String[] args) {
		SuperChecked s = new SuperChecked();
		s.show();
	}
}
