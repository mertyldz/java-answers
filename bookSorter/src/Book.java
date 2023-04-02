import java.util.Comparator;

public class Book  implements Comparator<Book> {
    String name;
    int pageNum;
    String writerName;
    String publishDate;
    public Book(){};

    public Book(String name, int pageNum, String writerName, String publishDate) {
        this.name = name;
        this.pageNum = pageNum;
        this.writerName = writerName;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
