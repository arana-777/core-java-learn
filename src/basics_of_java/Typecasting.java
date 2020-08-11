package basics_of_java;

public class Typecasting {

	public static void main(String[] args) {
		double d = 200.25;
		// explicit type casting is needed here as we are losing precision
		long l = (long)d;
		int i = (int)d; 
		short s = (short)d;
		byte b = (byte)d;
		
		System.out.println("Long value : " + l);
		System.out.println("Integer value : " + i);
		System.out.println("Short value : " + s);
		System.out.println("Byte value : " + b);
		
		int i1 = 100;
		// no explicit type casting is needed here as we are widening the number
		float f = i1;
		long l1 = i1;
		
		System.out.println("Float value : " + f);
		System.out.println("Long value : " + l1);
		
		
		

	}

}
