package basics_of_java.loops;

public class Do_while_loop {

	public static void main(String[] args) {
		boolean flag = true;
		int i = 0;
		do {
			i++;
			System.out.println(i + " true");
			if (i == 5) flag=false;
		} while(flag);

	}

}
