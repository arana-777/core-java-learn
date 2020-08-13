package oops_concepts.inheritance;

class Parent2 {
	String name;
	public Parent2(String n) {
		name = n;
	}
}
class Child1 extends Parent2 {
	String name;
	
	public Child1(String n1, String n2) {
		super(n1);
		this.name = n2;
	}
	public void details() {
		System.out.println(super.name + " and " + this.name);
	}
}
public class ConstructorAndInheritance {
	public static void main(String[] args) {
		Child1 cobj = new Child1("Parent", "Child");
		cobj.details();
	}
}
