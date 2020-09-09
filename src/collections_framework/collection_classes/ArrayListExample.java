package collections_framework.collection_classes;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<>();
		arr1.add("ab");
		arr1.add("bc");
		arr1.add("cd");
		System.out.println(arr1);
		
		ArrayList<Integer> arr2 = new ArrayList<>();
		arr2.add(20);
		arr2.add(100);
		arr2.add(2000);
		System.out.println(arr2);
	}
}
