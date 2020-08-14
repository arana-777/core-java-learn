package oops_concepts.aggregation;

class Address {
	int streetNo;
	String city, state;
	int pin;
	
	Address(int sno, String c, String s, int p) {
		this.streetNo = sno;
		this.city = c;
		this.state = s;
		this.pin = p;
	}
}
class Student {
	String name;
	Address ad;
	Student(String n, Address ad){
		this.name = n;
		this.ad = ad;
	}
}
public class Example1 {
	public static void main(String[] args) {
		Address add1 = new Address(12, "london", "England", 166);
		Student std = new Student("john", add1);
		System.out.println(std.name);
		System.out.println(std.ad.state);
	}
}
