import java.time.LocalDate;

public class Book {

    private String author;
    private String title;

    private Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title) {
        Book book = new Book(author, title);
        return book;
    }

    @Override
    public String toString(){
        return author+", " + title;
    }
}
class App4{
    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        book.toString();
        System.out.println(book);
    }
}