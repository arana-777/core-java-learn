package string_handling;

public class StringComparison {
	public static void main(String[] args) {
		// using equals() built-in method
		String s1 = "Hell";
		String s2 = "Hello";
		String s3 = "Hello";
		boolean b1 = s1.equals(s2);
		System.out.println("is s1 equal to s2: " + b1);
		boolean b2 = s2.equals(s3);
		System.out.println("is s2 equal to s3: " + b2);
		
		// using == operator
		String s = "Java";
		String str = "Java";
		String str1 = new String("Java");
		
		boolean b = (s == str);
		System.out.println("is s equal to str: " + b);
		// odd case where it will not be equal if used == operator to check
		b = (s == str1);
		System.out.println("is s equal to str1: " + b);
		
		// using CompareTo() built-in method
		// compares values and returns an integer value 
		// -21 = if string str1 < str2
		// 0  = both strings are equal
		// 21 = if string str1 > str2
		String strr1 = "Abhi";
		String strr2 = "Viraaj";
		String strr3 = "Abhi";
		int a = strr1.compareTo(strr2);
		System.out.println("is strr1 equal to strr2: " + a);
		a = strr1.compareTo(strr3);
		System.out.println("is strr1 equal to strr3: " + a);
		a = strr2.compareTo(strr3);
		System.out.println("is strr2 equal to strr3: " + a);
		
	}
}
