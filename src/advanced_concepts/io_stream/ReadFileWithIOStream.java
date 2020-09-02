package advanced_concepts.io_stream;

import java.io.*;

public class ReadFileWithIOStream {
	public static void main(String[] args) {
		File f1 = new File("/home/arana/eclipse-workspace/core-java-learn/resources/sample-file.txt");
		try {
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException fe) {
			System.out.println(fe);
		} catch (IOException ie) {
			System.out.println(ie);
		}
		
		
	}
}
