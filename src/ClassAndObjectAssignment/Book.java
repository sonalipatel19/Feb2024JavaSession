package ClassAndObjectAssignment;

public class Book {
	
	String title;
	String author;
	int pageCount;
	
	public static void main(String[] args) {
		// Assignment 2: Define a class named Book with the following attributes:
		//Create three Book objects and initialize their properties with different values.
		//Print the details of each book and the total number of books.
		//Modify the pageCount attribute of one book and print the updated details.
		//Create another Book object and update the total number of books.
		//Print the details of the new book and the updated total number of books.
		
		int totalBooks = 0;
		//1. Create three Book objects and initialize their properties with different values.
		Book b1 = new Book();
		b1.title = "Harry Potter";
		b1.author = "J.K. Rowling";
		b1.pageCount = 100;
		totalBooks++;

		Book b2 = new Book();
		b2.title = "Jumanji";
		b2.author = "Chris Van Allsburg";
		b2.pageCount = 120;
		totalBooks++;
		
		Book b3 = new Book();
		b3.title = "Sherlock Holmes";
		b3.author = "Conan Doyle";
		b3.pageCount = 150;
		totalBooks++;
		
		//2. Print the details of each book and the total number of books.
		
		System.out.println("Book Title" + "=" + b1.title + " " + "Book Author" + "=" + b1.author + " " + "Page Count" + "=" + b1.pageCount);
		System.out.println("Book Title" + "=" + b2.title + " " + "Book Author" + "=" + b2.author + " " + "Page Count" + "=" + b2.pageCount);
		System.out.println("Book Title" + "=" + b3.title + " " + "Book Author" + "=" + b3.author + " " + "Page Count" + "=" + b3.pageCount);
		System.out.println("Total Books" + "=" + totalBooks);
		
		//3. Modify the pageCount attribute of one book and print the updated details.
		
		b3.pageCount = 200;
		System.out.println("Page Count" + "=" + b3.pageCount);
		
		//4. Create another Book object and update the total number of books.
		
		Book b4 = new Book();
		b4.title = "The Secret Rooms";
		b4.author = "Catherine Bailey";
		b4.pageCount = 180;
		totalBooks++;
		
		//5. Print the details of the new book and the updated total number of books.
		System.out.println("Book Title" + "=" + b4.title + " " +  "Book Author" + "=" + b4.author + " " + "Page Count" + "=" + b4.pageCount);
		System.out.println("Total Books" + "=" + totalBooks);
	}

}
