package oops_concepts;

class DemoMethod {
	public void getName() {
		System.out.println("Shredder - method invoked with this keyword");
	}
	public void display() {
		this.getName();
	}
}
public class MethodAccessWithThisKeyword {
	public static void main(String[] args) {
		DemoMethod demo = new DemoMethod();
		demo.display();
	}
}
