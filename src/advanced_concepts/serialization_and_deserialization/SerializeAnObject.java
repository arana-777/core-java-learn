package advanced_concepts.serialization_and_deserialization;

import java.io.*;

class Studentinfo implements Serializable{
	String name;
	int rid;
	static String contact;
	
	Studentinfo(String n, int r, String c) {
		this.name = n;
		this.rid = r;
		this.contact = c;
	}
}
public class SerializeAnObject {
	public static void main(String[] args) {
		try {
			Studentinfo si = new Studentinfo("John", 24567, "11100222");
			FileOutputStream fos = new FileOutputStream("/home/arana/eclipse-workspace/core-java-learn/resources/sample-file.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(si);
			oos.flush();
			oos.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
