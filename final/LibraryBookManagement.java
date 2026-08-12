class LibraryBook {
    final String ISBN;
    String title;
    String author;
    double price;

    LibraryBook(String ISBN, String title, String author, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class LibraryBookManagementDemo {
    public static void main(String[] args) {

        LibraryBook book = new LibraryBook(
            "9780135166307",
            "Java Programming",
            "Herbert Schildt",
            650
        );

        book.display();

    }
}