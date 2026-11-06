package debug_exercise;

public class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    public static void main(String[] args) {
        Book b = new Book("Java Basics");
        System.out.println(b.title);
    }
}