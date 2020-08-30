package multithreading;

public class MainThreadExample {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		t.setName("MainThread");
		System.out.println("Name of the thread is : " + t);
	}
}
