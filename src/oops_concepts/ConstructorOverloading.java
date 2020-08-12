package oops_concepts;

class Cricketer {
	String name, team;
	int age;
	
	Cricketer() {
		name="";
		team="";
		age=0;
	}
	Cricketer(String n, String t, int a) {
		name = n;
		team = t;
		age = a;
	}
	Cricketer(Cricketer ckt) {
		name = ckt.name;
		team = ckt.team;
		age = ckt.age;
	}
	
	public String toString() {
		return "this is " + name + ", " + age +" years old and of Team " + team + ".";
	}
}
public class ConstructorOverloading {
	public static void main(String[] args) {
		Cricketer c1 = new Cricketer();
		Cricketer c2 = new Cricketer("brett lee","aussie", 35);
		Cricketer c3 = new Cricketer(c2);
		
		System.out.println(c2);
		System.out.println(c3);
		c1.name = "Virat Chohli";
		c1.team = "vanar sena";
		c1.age = 35;
		System.out.println(c1);
	}
}
