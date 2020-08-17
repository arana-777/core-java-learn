package oops_concepts;

class DemoObject {
	public void getName() {
		System.out.println("One-Piece");
	}
	public DemoObject display() {
		// return current object
		return this;
	}
}
public class CurrentObjectWithThisKeyword {
	public static void main(String[] args) {
		DemoObject demo = new DemoObject();
		DemoObject demo1 = demo.display();
		demo1.getName();
	}
}
