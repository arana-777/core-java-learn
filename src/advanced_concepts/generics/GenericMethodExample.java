package advanced_concepts.generics;

public class GenericMethodExample {
	static <V, T> void display (V v, T t) {
		System.out.println(v.getClass()+" = " + v);
		System.out.println(t.getClass().getName()+" = " + t);
	}
	
	public static void main(String[] args) {
		display(101, "This is a string");
	}
}
