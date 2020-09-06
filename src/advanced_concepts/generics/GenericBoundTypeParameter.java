package advanced_concepts.generics;

public class GenericBoundTypeParameter {
	
	static < T, V extends Number > void display(T t, V v) {
		System.out.println(v.getClass().getName()+ " = " + v);
		System.out.println(t.getClass().getName()+ " = " + t);
	}
	
	public static void main(String[] args) {
		display("this is a string", 2002);
		
		// below however will give error
//		display(20, "this is a string");
	}
}
