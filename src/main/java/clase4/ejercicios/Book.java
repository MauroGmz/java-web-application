package clase4.ejercicios;

public class Book {
    private int isbn;
    private String author;
    private String title;

    public Book(int isbn, String author, String title){
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn = " + isbn + ", autor = " + author + ", title = " + title;
    }


}
