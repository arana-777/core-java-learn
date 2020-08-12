package oops_concepts.methods;

public class SimpleMethod {
	public String return_name(String st) {
		String name = "johndoe";
		name += st;
		return name;
	}
	
	public static void main(String[] args) {
		SimpleMethod sm = new SimpleMethod();
		String value = sm.return_name(".tech");
		System.out.println(value);
	}
}
