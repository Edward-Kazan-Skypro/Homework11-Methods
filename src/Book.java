import java.util.Objects;

public class Book {

    private Author author;
    private int year;
    private String title;

    //Конструктор с указанием только Автора
    public Book(Author author) {
        this.author = author;
    }

    //Конструктор с указанием Автора и года издания книги
    public Book(Author author, int year) {
        this.author = author;
        this.year = year;
    }

    //Конструктор с указанием Автора и названия книги
    public Book(Author author, String title) {
        this.author = author;
        this.title = title;
    }

    //Конструктор с указанием Автора, года и названия книги
    public Book(Author author, int year, String title) {
        this.author = author;
        this.year = year;
        this.title = title;
    }

    //Геттеры для всех полей класса
    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    //Сеттер для поля «Год публикации»
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Книга: " +
                "автор - " + getAuthor().getName() + " " + getAuthor().getSurname() +
                ", год издания - " + year +
                ", название - " + title + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getYear() == book.getYear() && Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getTitle(), book.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthor(), getYear(), getTitle());
    }
}

