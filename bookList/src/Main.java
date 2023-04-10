import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> bookStore = new HashMap<>();
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Book> filteredBooks = new ArrayList<>();

        books.add(new Book("Book1", 50, "Author1", "2023-04-10"));
        books.add(new Book("Book2", 100, "Author2", "2023-04-10"));
        books.add(new Book("Book3", 75, "Author3", "2023-04-10"));
        books.add(new Book("Book4", 95, "Author4", "2023-04-10"));
        books.add(new Book("Book5", 150, "Author5", "2023-04-10"));
        books.add(new Book("Book6", 30, "Author6", "2023-04-10"));
        books.add(new Book("Book7", 330, "Author7", "2023-04-10"));
        books.add(new Book("Book8", 40, "Author8", "2023-04-10"));
        books.add(new Book("Book9", 190, "Author9", "2023-04-10"));
        books.add(new Book("Book10", 120, "Author10", "2023-04-10"));

        for (Book b : books) {
            bookStore.put(b.getBookName(), b.getAuthorName());
        }

        books.stream().filter(i -> i.getPageNumber() > 100).forEach(i -> filteredBooks.add(i));

        for (Book b : filteredBooks) {
            System.out.println(b.getBookName());
        }


    }
}