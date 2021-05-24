package kg.megacom.ScopeSingleton;

import org.springframework.stereotype.Component;

@Component
public class Author {

    private Person person;

    public Author(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Author{" +
                "person=" + person +
                '}';
    }
}
