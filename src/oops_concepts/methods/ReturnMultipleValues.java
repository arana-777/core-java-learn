package oops_concepts.methods;

public class ReturnMultipleValues {
	public int[] add_subtract(int a, int b) {
		int[] s = new int[2];
		s[0] = a + b;
		s[1] = a - b;
		return s;
	}
	public static void main(String[] args) {
		ReturnMultipleValues rm = new ReturnMultipleValues();
		int[] total = rm.add_subtract(200, 99);
		System.out.println("Sum: " + total[0] + " ,Diff: " + total[1]);
		
	}
}
