package basics_of_java;

public class Static_block_execution {
	
	// static block which will executed first before main function
	static {
		System.out.println("Welcome to static code block analysis.");
		System.out.println("This is a static block , and is executed before main block.");
		System.out.println("End of static block.");
	}
	public static void main(String[] args) {
		System.out.println("This is the main() method.");

	}

}
