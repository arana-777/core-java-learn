package string_handling;

public class StringClassFunctions {
	public static void main(String[] args) {
		// charAt() method
		String str = "HELLOWORLD";
		System.out.println(str.charAt(3));
		
		// equalsIgnoreCase() method
		String st1 = "java";
		System.out.println(st1.equalsIgnoreCase("JAVA"));
		
		// length() method
		System.out.println(str.length());
		
		// replace() method
		System.out.println(str.replace("O", "o"));
		
		// toLowerCase() method
		System.out.println(str + " in lowercase is " + str.toLowerCase());
		
		// toUpperCase() method
		System.out.println("abcdef in uppercase is " + "abcdef".toUpperCase());
		
		
		
		
	}
}
