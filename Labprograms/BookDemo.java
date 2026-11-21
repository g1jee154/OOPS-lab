package Labprograms;
class Book {
    int bookID;
    String title;
    String author;
    double price;
    static int count = 0;

    Book(int bookID, String title, String author, double price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
        count++;
    }

    void display() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
        System.out.println();
    }

    void search(int id) {
        if (bookID == id) {
            System.out.println("Book Found: " + title);
        } else {
            System.out.println("Book ID not matched!");
        }
    }

    void search(String title) {
        if (this.title.equalsIgnoreCase(title)) {
            System.out.println("Book Found: " + this.title);
        } else {
            System.out.println("Book title not matched!");
        }
    }

    Book costlierBook(Book other) {
        return price >= other.price ? this : other;
    }

    static void totalBooks() {
        System.out.println("Total Books Created: " + count);
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book(101, "C Programming", "Dennis Ritchie", 300);
        Book b2 = new Book(102, "Python", "Guido", 400);
        Book b3 = new Book(103, "Java", "James Gosling", 500);

        System.out.println("Book Details:");
        b1.display();
        b2.display();
        b3.display();

        System.out.println("Search by Book ID:");
        b1.search(101);

        System.out.println("\nSearch by Title:");
        b3.search("Java");

        Book expensive = b1.costlierBook(b3);
        System.out.println("\nCostlier Book:");
        expensive.display();

        Book.totalBooks();
    }
}
