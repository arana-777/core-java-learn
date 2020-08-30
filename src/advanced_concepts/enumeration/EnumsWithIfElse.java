package advanced_concepts.enumeration;

enum Weekdays {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumsWithIfElse {
	public static void main(String[] args) {
		Weekdays weekday = Weekdays.SUNDAY;
		
		if (weekday == Weekdays.SUNDAY || weekday == Weekdays.SATURDAY) {
			System.out.println("it is weekend!!!");
		} else {
			System.out.println("It is weekday: " + weekday);
		}
	}
}
