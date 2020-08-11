package basics_of_java;

public class Initializer_block {
	{
		System.out.println("Welcome to initializer block analysis");
		System.out.println("This is Initializer block");
	}
	public Initializer_block() {
		System.out.println("Default constructor invoked");
	}
	
	public static void main(String[] args) {
		Initializer_block obj = new Initializer_block();
		System.out.println("This is the main() method");
	}
}
