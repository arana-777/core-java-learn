package collections_framework.collection_classes;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("A");
		System.out.println(hs);
	}
}
