package oops_concepts;

class Parent {
	int parent_variable = 200;
	public void details( ) {
		System.out.println("Parent method!");
	}
}
public class InheritanceExample extends Parent {
	
	public void details() {
		System.out.println("Overriding parent method!");
		System.out.println("And accessing parent variable: " + parent_variable);
	}
	public void child_details() {
		System.out.println("Child method!");
	}
	public static void main(String[] args) {
		InheritanceExample cobj = new InheritanceExample();
		cobj.child_details();
		cobj.details();
	}
}
