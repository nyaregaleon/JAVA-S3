package tutorial_4;

public class Book {
    // 1. Instance Variables
    String title;
    String author;
    double price;

    // 2. Constructor to initialize variables
    public Book(String bookTitle, String bookAuthor, double bookPrice) {
        title = bookTitle;
        author = bookAuthor;
        price = bookPrice;
    }

    // 3. Method to display book information
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    
    }
}

// Main class to run the program
 class BookMain {
    public static void main(String[] args) {
        // 4. Create (instantiate) two book objects
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 14.99);
        Book book2 = new Book("The Lost Symbol", "Dan Brown", 16.50);

        // 5. Display their details
        System.out.println("- Book List -");
        book1.displayDetails();
        book2.displayDetails();
    }
}



