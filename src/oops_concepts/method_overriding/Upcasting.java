package oops_concepts.method_overriding;

class Game {
	public void type() {
		System.out.println("Indoor & Outdoor");
	}
}
class Cricket extends Game {
	public void type() {
		System.out.println("Outdoor game");
	}
}
public class Upcasting {
	public static void main(String[] args) {
		Game gm = new Game();
		Cricket ck = new Cricket();
		gm.type();
		ck.type();
		//doing upcasting
		gm = ck;
		gm.type();
	}
}
