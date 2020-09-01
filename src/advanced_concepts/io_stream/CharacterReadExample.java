package advanced_concepts.io_stream;

import java.io.*;

public class CharacterReadExample {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		char c = (char)br.read();
		System.out.println(c);
		
	}
}
