package lecture9;

import org.hibernate.Session;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// CRUD
public class BookDao {

    public boolean create(Book book) {

        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.saveOrUpdate(book);
            session.getTransaction().commit();
        } catch (Exception e) {
            return false;
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return true;
    }

    public Book read(long id) {
        Book book = null;

        Connection connection = DBConnManager.getConnection();
        Statement statement = null;

        StringBuilder statementString = new StringBuilder("SELECT * FROM book WHERE book_id = " + id + ";");

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(statementString.toString());

            if (resultSet.next()) {
                book = new Book();
                book.setBookId(resultSet.getInt("book_id"));
                book.setTitle(resultSet.getString("title"));
                book.setDescription(resultSet.getString("description"));
            }
        } catch (SQLException se) {
            System.out.println("blah");
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("blah");
                }
            }
        }
        DBConnManager.close(connection);
        return book;
    }

    public List<Book> readAll() {
        Connection connection = DBConnManager.getConnection();
        Statement statement = null;
        List<Book> list = new ArrayList<>();
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from book");

            while (resultSet.next()) {
                Book book = new Book();
                book.setBookId(resultSet.getInt("book_id"));
                book.setTitle(resultSet.getString("title"));
                book.setDescription(resultSet.getString("description"));
                list.add(book);
            }
        } catch (SQLException sqle) {
            System.out.println("blah");
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        DBConnManager.close(connection);
        return list;
    }

    public int update(Book book) {
        Connection connection = DBConnManager.getConnection();
        Statement statement = null;
        int resultSet = 0;

        StringBuilder statementString = new StringBuilder("UPDATE book SET (title, description) = ('"
                + book.getTitle() + "', '" + book.getDescription() + "') WHERE book_id = " + book.getBookId() + ";");

        try {
            statement = connection.createStatement();
            resultSet = statement.executeUpdate(statementString.toString());

        } catch (SQLException se) {
            System.out.println("blah");
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("blah");
                }
            }
        }
        DBConnManager.close(connection);
        return resultSet;
    }

    public int delete(long id) {
        Connection connection = DBConnManager.getConnection();
        Statement statement = null;
        int resultSet = 0;

        StringBuilder statementString = new StringBuilder("DELETE FROM book WHERE book_id = " + id + ";");

        try {
            statement = connection.createStatement();
            resultSet = statement.executeUpdate(statementString.toString());

        } catch (SQLException se) {
            System.out.println("blah");
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("blah");
                }
            }
        }
        DBConnManager.close(connection);
        return resultSet;
    }


}
