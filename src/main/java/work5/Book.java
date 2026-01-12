package work5;

public class Book {
    public String title;
    public String author;
    public int pages;

    @Override
    public String toString() {
        return "book name is '" + title + "' writed by '" + author + "'  pages: " + pages;
    }
}
