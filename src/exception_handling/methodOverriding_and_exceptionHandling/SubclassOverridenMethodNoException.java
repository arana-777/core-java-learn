package exception_handling.methodOverriding_and_exceptionHandling;

class Super2 {
	void show() throws Exception {
		System.out.println("paret class");
	}
}

class Sub2 extends Super2 {
	void show() { // correct
		System.out.println("child class");
	}
}
public class SubclassOverridenMethodNoException {
	public static void main(String[] args) {
		try {
			Super2 s = new Sub2();
			s.show();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
