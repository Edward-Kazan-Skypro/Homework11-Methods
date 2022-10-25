import java.util.Objects;

public class Author {

    private String name;
    private String surname;

    //Добавил небольшую проверку имени и фамилии автора,
    // т.к. объекты этого класса используются при создании объектов класса Book
    public Author(String name, String surname) {
        String emptyName = "имя не указано";
        String emptySurname = "фамилия не указана";
        if (name.isEmpty()) name = emptyName;
        if (surname.isEmpty()) surname = emptySurname;

        if (name.equals(emptyName) || surname.equals(emptySurname)) {
            System.out.println("Автор: имя - " + name + ", фамилия - " + surname + " - не добавлен");
            System.out.println("Пожалуйста, укажите имя/фамилию автора!");
            System.out.println("");
        } else {
            this.name = name;
            this.surname = surname;
            System.out.println("Добавлен автор - " + name + " " + surname);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return getName().equals(author.getName()) && getSurname().equals(author.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname());
    }

    @Override
    public String toString() {
        return "Автор: " + "имя - " + name + ", фамилия - " + surname;
    }
}


