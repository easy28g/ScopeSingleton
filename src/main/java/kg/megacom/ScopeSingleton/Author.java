package kg.megacom.ScopeSingleton;

import kg.megacom.ScopeSingleton.service.PersonService;
import kg.megacom.ScopeSingleton.service.impl.PersonServiceImpl;
import kg.megacom.ScopeSingleton.service.impl.PersonServiceImpl2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") // если написать вместо singleton --- prototype, то в ответе будет false
public class Author {

    @Autowired
    private Person person;

    @Autowired
    @Qualifier("personServiceImpl")
    private PersonService personService;

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

    public void testPersonService(){
        Person person = personService.getPerson();
        System.out.println("Test == "+person);
    }
}
