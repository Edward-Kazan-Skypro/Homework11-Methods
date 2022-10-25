public class mainApp {
    public static void main(String[] args) {
        // Задание 1
        Author author_1 = new Author("Mark", "Twain");
        Author author_2 = new Author("Stephen", "King");
        //Создание объекта класса Author с одним пустым полем - для теста
        Author author_3 = new Author("", "wwww");

        Book book_1 = new Book(author_1, 1903, "A Dog’s Tale");
        Book book_2 = new Book(author_2, 1983, "Pet Cemetery");
        book_1 = book_2;

        book_2.setYear(1984);

        System.out.println(book_1);
        System.out.println(book_2);

        System.out.println();
    }
}