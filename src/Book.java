public class Book {
    private String title;
    private int publicationDate;
    private Autor autor;

    public Book(String title, int publicationDate, Autor autor) {
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
}
