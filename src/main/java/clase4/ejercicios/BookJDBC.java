package clase4.ejercicios;

import java.sql.*;
import java.util.*;

public class BookJDBC {
    private static final String SQL_SELECT = "SELECT isbn, author, title FROM test.book";
    private static final String SQL_INSERT = "INSERT INTO test.book(author, title) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE test.book SET author=?, title=? WHERE isbn = ?";
    private static final String SQL_DELETE = "DELETE FROM test.book WHERE isbn=?";

    // Mostrar en pantalla las reservas de los libros
    public List<Book> select(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Book book = null;

        List<Book> books = new ArrayList<Book>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int isbn = rs.getInt("isbn");
                String author = rs.getString("author");
                String title = rs.getString("title");
                book = new Book(isbn, author, title);
                books.add(book);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }
        finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return books;
    }

    public int insert(Book book){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, book.getAuthor());
            stmt.setString(2, book.getTitle());

            System.out.println("Ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados" + rows);
        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }
        finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int update(Book book){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, book.getAuthor());
            stmt.setString(2, book.getTitle());
            stmt.setInt(3, book.getIsbn());

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados: " + rows);

        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }
        finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int delete(Book book){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, book.getIsbn());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados: " + rows);
        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }
        finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

}
