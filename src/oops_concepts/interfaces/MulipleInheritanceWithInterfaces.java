package oops_concepts.interfaces;

interface Moveable1 {
	boolean isMoveable1();
}
interface Rollable1 {
	boolean isRollable1();
}
class Tyre implements Moveable1, Rollable1 {
	int width;
	public boolean isMoveable1() {
		return true;
	}
	public boolean isRollable1() {
		return true;
	}
	
}
public class MulipleInheritanceWithInterfaces {
	public static void main(String[] args) {
		Tyre tr = new Tyre();
		System.out.println(tr.isMoveable1());
		System.out.println(tr.isRollable1());
	}
}
