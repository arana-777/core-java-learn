package advanced_concepts.generics;

class GenExample {
	private double val;
	<T extends Number> GenExample(T ob) {
		this.val = ob.doubleValue();
	}
	
	void show() {
		System.out.println(this.val);
	}
}
public class GenericConstructorExample {
	public static void main(String[] args) {
		GenExample g1 = new GenExample(100);
		GenExample g2 = new GenExample(222.5f);
		g1.show();
		g2.show();
	}
}
