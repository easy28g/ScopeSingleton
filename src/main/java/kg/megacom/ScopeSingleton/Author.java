package kg.megacom.ScopeSingleton;

import kg.megacom.ScopeSingleton.service.PersonService;
import kg.megacom.ScopeSingleton.service.impl.PersonServiceImpl;
import kg.megacom.ScopeSingleton.service.impl.PersonServiceImpl2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Author {

    @Autowired
    PersonService person;

    public Author(PersonService person) {
        this.person = person;
    }

    public PersonService getPerson() {
        return person;
    }

    public void setPerson(PersonService person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Author{" +
                "person=" + person +
                '}';
    }
}
