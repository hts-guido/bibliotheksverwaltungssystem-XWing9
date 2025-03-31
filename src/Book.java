import java.io.Serializable;

public class Book implements Serializable {
    // Attribut
    private String title;
    private String author;
    private int ISBN;

    // Standardkonstruktor (ohne Parameter)
    public Book() {
    }

    // Optional: construktor mit Parameter
    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getter-Methode für title
    public String getTitle() {
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getISBN(){
        return ISBN;
    }
    // Setter-Methode für title
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }

    // Optional: Überschreiben der toString-Methode für eine bessere Darstellung
    @Override
    public String toString() {
        return "Book{title='" + title + "'}";
    }
}