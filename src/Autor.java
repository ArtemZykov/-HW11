import java.util.Objects;

public class Autor {
    private final String firstname;
    private final String lastname;

    public Autor(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
        // getFirsname - передает
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "Автор " + firstname + " " + lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(firstname, autor.firstname) && Objects.equals(lastname, autor.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }
}
