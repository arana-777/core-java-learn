package basics_of_java.conditionals;

public class Switch_cases {
	public static void main(String[] args) {
		String name = "Mango";
		
		switch(name) {
		case "Apple":
			System.out.println("Found: Apple");
			break;
		case "Orange":
			System.out.println("Found Orange");
			break;
		case "Mango":
			System.out.println("Found Mango");
			break;
		}
	}
}
