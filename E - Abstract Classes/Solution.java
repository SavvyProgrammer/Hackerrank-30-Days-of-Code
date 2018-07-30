import java.util.Scanner;

abstract class Book{

    String title;
    String author;

    Book(String title, String author){

        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook extends Book{

	int price;

	MyBook(String title, String author, int price){

		super(title, author);
		this.price = price;

	}

	@Override
	void display(){

	System.out.printf("Title: %s%nAuthor: %s%nPrice: %d%n", super.title, super.author, this.price);

	}
}

public class Solution{

	public static void main(String[] args){

	Scanner in = new Scanner(System.in);
	String title = in.nextLine();
	String author = in.nextLine();
	int price = in.nextInt();
	Book book = new MyBook(title, author, price);
	book.display();
	}

}
