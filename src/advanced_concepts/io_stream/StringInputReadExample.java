package advanced_concepts.io_stream;

import java.io.*;

public class StringInputReadExample {
	public static void main(String[] args) {
		String text;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			text = br.readLine();
			System.out.println(text);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
	}
}
