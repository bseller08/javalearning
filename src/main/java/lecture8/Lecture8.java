package lecture8;


import java.util.List;

public class Lecture8 {

    public static void main(String[] args) {

        BookDao bookDao = new BookDao();
        List<Book> list = bookDao.readAll();
        for (Book book : list) {
            System.out.println(book);
        }

    }

}
