package advanced_concepts.io_stream;
import java.io.*;

public class WriteFileWithIOStream {
	public static void main(String[] args) {
		try {
			File f1 = new File("/home/arana/eclipse-workspace/core-java-learn/resources/sample-file.txt");
			String str = "Write this string to my file.";
			FileWriter fw = new FileWriter(f1);
			fw.write(str);
			fw.append("\nc");
			fw.close();
			
		} catch (IOException ie) {
			System.out.println(ie);
		}
	}
} 
