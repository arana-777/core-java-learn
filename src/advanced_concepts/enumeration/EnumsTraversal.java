package advanced_concepts.enumeration;

enum weekdays {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumsTraversal {
	public static void main(String[] args) {
		weekdays[] weeks = weekdays.values();
		
		for (weekdays weekday : weeks) {
			System.out.print(weekday + " ");
		}
		
		// valueOf() method
		weekdays weekday;
		weekday = weekdays.valueOf("MONDAY");
		System.out.println();
		System.out.println(weekday);
	}
}
