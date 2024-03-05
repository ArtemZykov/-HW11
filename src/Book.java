import java.util.Objects;

public class Book {
    private String title;
    private int publicationDate;
    private Autor autor;

    public Book (String title, int publicationDate, Autor autor) {
        this.title = title;
        this.publicationDate = publicationDate;
        this.autor = autor;
    }
    public String getTitle() {
        return title;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }
    public String toString () {
        return " Название книги " + this.title + " дата публикации " + this.publicationDate + " автор " + getAutor().getFirstname()+ " " + getAutor().getLastname();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationDate == book.publicationDate && Objects.equals(title, book.title) && Objects.equals(autor, book.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publicationDate, autor);
    }

}
