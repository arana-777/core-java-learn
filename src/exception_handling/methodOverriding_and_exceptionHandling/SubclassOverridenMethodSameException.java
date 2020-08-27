package exception_handling.methodOverriding_and_exceptionHandling;

class Super1 {
	void show() throws Exception {
		System.out.println("parent class");
	}
}

class Sub1 extends Super1 {
	void show() throws Exception { // correct way
		System.out.println("child class");
	}
}
public class SubclassOverridenMethodSameException {
	public static void main(String[] args) {
		try {
			Super1 s = new Sub1();
			s.show();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
