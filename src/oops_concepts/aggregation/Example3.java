package oops_concepts.aggregation;

class Publisher3 {
	String name;
	String publisherId;
	String city;
	
	Publisher3(String name, String id, String city) {
		this.name = name;
		this.publisherId = id;
		this.city = city;
	}
}

class Author3 {
	String authorName;
	int age;
	String place;
	
	Author3(String authName, int age, String place) {
		this.authorName = authName;
		this.age = age;
		this.place = place;
	}
}

class Book3 {
	String name;
	int price;
	Author3 author;
	Publisher3 publisher;
	
	Book3(String name, int price, Author3 author, Publisher3 publisher) {
		this.name = name;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
	}
}
public class Example3 {
	public static void main(String[] args) {
		Author3 auth1 = new Author3("John", 24, "ENG");
		Publisher3 publ1 = new Publisher3("Micro Publication", "MP", "LD");
		Book3 bk1 = new Book3("Java for beginners", 80, auth1, publ1);
		
		System.out.println("--------Book Details--------");
		System.out.println("Book name: " + bk1.name);
		System.out.println("Book price: $" + bk1.price);
		System.out.println("--------Author Details--------");
		System.out.println("Author name: " + bk1.author.authorName);
		System.out.println("Author age: " + bk1.author.age);
		System.out.println("Author place: " + bk1.author.place);
		System.out.println("--------Publisher Details--------");
		System.out.println("Publisher name: " + bk1.publisher.name);
		System.out.println("Publisher ID: " + bk1.publisher.publisherId);
		System.out.println("Publisher city: " + bk1.publisher.city);
		
	}
	
}
