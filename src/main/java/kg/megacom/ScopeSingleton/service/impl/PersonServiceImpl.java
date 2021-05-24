package kg.megacom.ScopeSingleton.service.impl;

import kg.megacom.ScopeSingleton.Person;
import kg.megacom.ScopeSingleton.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public Person getPerson() {
        return new Person("Azamat-1",22);
    }
}
