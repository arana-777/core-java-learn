package advanced_concepts.generics;

class Gen <T> {
	T ob; // an object of type is declared
	
	// constructor
	Gen(T o) {
		this.ob = o;
	}
	
	public T getOb() { return this.ob;	}
}
public class Example1 {
	public static void main(String[] args) {
		
		// an instance of Integer type Gen class
		Gen <Integer> iob = new Gen<>(100);
		int x = iob.getOb();
		System.out.println(x);
		
		// an instance of String type Gen class
		Gen <String> sob = new Gen<>("Hello World of Generics.");
		String str = sob.getOb();
		System.out.println(str);
	}
}
