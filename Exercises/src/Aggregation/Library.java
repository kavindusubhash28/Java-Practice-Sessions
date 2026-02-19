package Aggregation;

public class Library {

    String name;
    int year;
    Book[] books;

    public Library(String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    public void displayInfo(){
        System.out.println(this.name + " (est. " + this.year + ")");
        System.out.println("Books available:");
        for (Book b : books) {
            System.out.println("- " + b.displayInfo());
        }
    }
}
