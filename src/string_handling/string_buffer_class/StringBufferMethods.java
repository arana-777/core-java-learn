package string_handling.string_buffer_class;

public class StringBufferMethods {
	public static void main(String[] args) {
		// append() method
		StringBuffer str1 = new StringBuffer("test");
		str1.append(123);
		System.out.println(str1);
		
		// insert() method
		StringBuffer str2 = new StringBuffer("test");
		str2.insert(2, 123);
		System.out.println(str2);
		str2.insert(6, "===");
		System.out.println(str2);
		
		// reverse() method
		str1.reverse();
		System.out.println(str1);
		
		// replace() method
		StringBuffer str3 = new StringBuffer("Hello World");
		str3.replace(6, 11, "java");
		System.out.println(str3);
		
		
	}
}
