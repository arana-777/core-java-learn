package oops_concepts;

class Parent1 {
	String name, className;
	
	public void detail() {
		className = "Parent";
		System.out.println(className);
	}
}
class Child extends Parent1 {
	String name;
	public void details() {
		super.name = "parent";
		super.detail();
		name = "child";
		System.out.println("name in parent is : " + super.name);
		System.out.println("name in child is : " + name);
	}
}
public class InheritanceAndSuper {
	public static void main(String[] args) {
		Child cobj = new Child();
		cobj.details();
	}
}
