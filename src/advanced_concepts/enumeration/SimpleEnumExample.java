package advanced_concepts.enumeration;

enum WeekDays {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class SimpleEnumExample {
	public static void main(String[] args) {
		WeekDays wk;
		wk = WeekDays.MONDAY;
		System.out.println("Today is : " + wk);
	}
}
