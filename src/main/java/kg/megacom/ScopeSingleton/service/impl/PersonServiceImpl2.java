package kg.megacom.ScopeSingleton.service.impl;

import kg.megacom.ScopeSingleton.Author;
import kg.megacom.ScopeSingleton.Person;
import kg.megacom.ScopeSingleton.service.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl2 implements PersonService {

    @Override
    public Person getPerson() {
        return new Person("IMPL-2",22);
    }

    @Override
    public String toString() {
        return "PersonServiceImpl2{" +
                "name='"+ getPerson().getName() +"\'"+
                ", age='"+ getPerson().getAge() +"'}";
    }
}
