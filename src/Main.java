import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        //String nameAutor1 = "Maksim Gorky";
        //String nameBook1 = "OLD ISERGIL";
        //String nameAutor2 = "Sergey Esenin";
        //String nameBook2 = "Black Man";

        Autor esenin = new Autor("Сергей ", "Есенин ");
        Autor gorky = new Autor("Максим ", "Горький " );
        Book blackMan = new Book("Черный человек", 1926, esenin);
        Book oldIsergil = new Book("Старуха Изергиль", 1891, gorky);

        //System.out.println(" Автор книги: " + blackMan.getAutor().getFirstname()+" "+ blackMan.getAutor().getLastname() +
                //", название  книги: " + blackMan.getTitle() + ", год публикации: " + blackMan.getPublicationDate());
        //System.out.println(" Автор книги: " +  oldIsergil.getAutor().getFirstname()+" "+ oldIsergil.getAutor().getLastname() +
                //" Название книги: " + oldIsergil.getTitle() + ", год публикации: " + oldIsergil.getPublicationDate());
        print(oldIsergil);
        print(blackMan);
        blackMan.setPublicationDate(2000); //set... позволяет изменить от слово setupe (установить)
        print(blackMan);
        System.out.println(oldIsergil);
        System.out.println(blackMan);
        System.out.println( blackMan.equals(oldIsergil));
        System.out.println(oldIsergil.hashCode());
        System.out.println(blackMan.hashCode());



    }
    private static void print(Book book) {
        System.out.println(" Автор книги: " + book.getAutor().getFirstname() + " " + book.getAutor().getLastname() +
                ", название  книги: " + book.getTitle() + ", год публикации: " + book.getPublicationDate()); // что бы не
        // дублировать "System.out.println(" Автор книги: " + blac...." сделали метод который выводит необходимую инфу
        // "подсмотрено" и просто печатаем print(название книги") и вовдятся необходимые нам данные. КРУТЬ


    }







}