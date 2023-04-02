import java.util.*;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("A", 100, "Orhan Pamuk", "01-01-0101");
        Book book2 = new Book("B", 400, "Orhan Pamuk", "01-01-0101");
        Book book3 = new Book("C", 250, "Orhan Pamuk", "01-01-0101");
        Book book4 = new Book("Z", 500, "Orhan Pamuk", "01-01-0101");

        TreeSet<Book> hs = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });


        hs.add(book1);
        hs.add(book2);
        hs.add(book3);
        hs.add(book4);

        for(Book b : hs){
            System.out.println(b.getName());
        }


        TreeSet<Book> hs2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNum() - o2.getPageNum();
            }
        });

        System.out.println("-------------New Order-------------");

        hs2.add(book1);
        hs2.add(book2);
        hs2.add(book3);
        hs2.add(book4);

        for(Book a : hs2){
            System.out.println(a.getName());
        }




    }
}