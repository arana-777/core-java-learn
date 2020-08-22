package string_handling.string_buffer_class;

public class SimpleExample {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("study");
		System.out.println(sb);
		//modifying object
		sb.append("java");
		System.out.println(sb);
	}
}
