package file_io;
import java.io.*;

public class ReadFileExample {
	public static void main(String[] args) throws FileNotFoundException {
		String fileAbsPath = "resources/sample-file.txt";
		BufferedReader br = new BufferedReader(new FileReader(fileAbsPath));
		
		try (br) { // resource is declared outside the try
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException ie) {
			System.out.println("I/O Exception: " + ie);
		}
	}
}
