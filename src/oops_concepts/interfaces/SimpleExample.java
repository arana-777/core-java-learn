package oops_concepts.interfaces;

interface Moveable {
	int AVG_SPEED=40;
	void move();
}
class Vehicle implements Moveable {
	public void move() {
		System.out.println("Average speed is : " + AVG_SPEED);
	}
}
public class SimpleExample {
	public static void main(String[] args) {
		Vehicle vc = new Vehicle();
		vc.move();
	}
}
