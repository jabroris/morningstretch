package hackerrank.abstraction;

import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
    
    public String getAuthor() {
    	return author;
    }
}

// Declare your class here. Do not use the 'public' access modifier.
    // Declare the price instance variable
class MyBook extends Book {
	
	int price;
	
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
	MyBook(String title, String author, int price) {
		super(title, author);
		this.price = price;
	}
    
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    public void display() 
    {
    	System.out.println("Title: " + title);
    	System.out.println("Author: " + author);
    	System.out.println("Price: " + price);
    }
    
 //End class
}

class YourBook extends Book implements Read{

	YourBook(String title, String author) {
		super(title, author);
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		
	}

	@Override
	public int getPages() {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class BookMain {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
        book.getAuthor();
        
        YourBook yoBook = new YourBook("hey", "he");
        yoBook.display();
        System.out.println(yoBook.getPages());
        
    }
}

interface Read {
	int getPages();
}
