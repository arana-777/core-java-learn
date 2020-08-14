package oops_concepts.aggregation;

class Author {
	String authorName;
	int age;
	String place;
	
	Author(String n, int a, String p) {
		this.authorName = n;
		this.age = a;
		this.place = p;
	}
}
class Book {
	String name;
	int price;
	Author author;
	
	Book(String n, int p, Author author) {
		this.name = n;
		this.price = p;
		this.author = author;
	}
}
public class Example2 {
	public static void main(String[] args) {
		Author auth1 = new Author("Thomas Shelby", 25, "London");
		Book bk1 = new Book("Peaky Blinders", 9, auth1);
		
		System.out.println(bk1.name + " is priced at $"+bk1.price + " and is writtn by " + bk1.author.authorName + ".");
	}

}
