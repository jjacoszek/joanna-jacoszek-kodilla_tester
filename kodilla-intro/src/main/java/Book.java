public class Book {

    private String author;
    private String title;

    public static String of(String author, String title) {

        Book book = Book.of("Isaac Asimov", "The Galaxy");

    }

    public static void main(String[] args) {
        String Book = Book.of();
        System.out.println(Book);
    }
}
