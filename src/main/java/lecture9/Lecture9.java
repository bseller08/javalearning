package lecture9;


import java.util.List;

public class Lecture9 {

    public static void main(String[] args) {

        BookDao bookDao = new BookDao();
        Book book = new Book("Super Speed Maximum", "World Description");
        bookDao.create(book);
        book = new Book("Super Speed Maximum", "); drop table book;");
        bookDao.create(book);

    }

}
