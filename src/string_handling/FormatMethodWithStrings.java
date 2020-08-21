package string_handling;

public class FormatMethodWithStrings {
	public static void main(String[] args) {
		String a1 = String.format("%d", 125);
		String a2 = String.format("%s", "HelloJava");
		String a3 = String.format("%f", 12.54);
		String a4 = String.format("%x", 125);
		String a5 = String.format("%c", 'a');
		
		System.out.println("Integer value: "+ a1);
		System.out.println("String value: "+ a2);
		System.out.println("Float value: "+ a3);
		System.out.println("Hexadecimal value: "+ a4);
		System.out.println("Char value: "+ a5);
	}
}
