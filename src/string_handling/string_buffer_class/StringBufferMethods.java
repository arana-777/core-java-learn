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
		
		// capacity() method
		StringBuffer str4 = new StringBuffer();
		System.out.println(str4.capacity()); // will output default capacity of 16 characters
		
		// ensureCapacity() method
		// if argument of ensureCapacity() method is greater than existing capacity,
		// then there will be change in current capacity using below formula,
		// newCapacity = (oldCapacity*2) + 2
		StringBuffer str5 = new StringBuffer();
		System.out.println(str5.capacity()); // will output 16 : default capacity
		str5.ensureCapacity(30); // greater than existing capacity
		System.out.println(str5.capacity()); // output 34 based on newCapacity formula
		
		
		
		
		
		
	}
}
