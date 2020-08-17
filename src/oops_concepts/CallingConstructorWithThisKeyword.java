package oops_concepts;

class DemoThis {
	DemoThis() {
		// calling constructor with this keyword
		this("Calling constructor with this-keyword");
	}
	DemoThis(String str) {
		System.out.println(str);
	}
}
public class CallingConstructorWithThisKeyword {
	public static void main(String[] args) {
		DemoThis demo = new DemoThis();
		
	}
}
