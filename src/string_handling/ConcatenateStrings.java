package string_handling;

public class ConcatenateStrings {
	public static void main(String[] args) {
		
		// using concat built-in method
		String s1 = "Hello ";
		String s2 = "Java.";
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		// using + operator
		String s = "Hello";
		String str = ", Is anyone there?";
		String str1 = s + str;
		String str2 = "We are using Java version " + 11;
		System.out.println(str1);
		System.out.println(str2);
	}
}
