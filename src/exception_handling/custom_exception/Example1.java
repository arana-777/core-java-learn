package exception_handling.custom_exception;

class ItemNotFound extends Exception {
	public ItemNotFound(String s) {
		super(s);
	}
}

class Demo {
	static void find(int arr[], int item) throws ItemNotFound {
		boolean flag = false;
		for (int i=0; i < arr.length; i++) {
			if (item == arr[i]) flag=true;
		}
		if (!flag) {
			throw new ItemNotFound("Item not found!"); // calling constructor of user-defined exception
		} else {
			System.out.println("Item found");
		}
	}
}
public class Example1 {
	public static void main(String[] args) {
		try {
			Demo.find(new int[] {12,25,40}, 10);
		} catch (ItemNotFound ie) {
			System.out.println(ie);
		}
	}
}
