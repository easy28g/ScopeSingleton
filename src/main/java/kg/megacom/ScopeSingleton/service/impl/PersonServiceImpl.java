package kg.megacom.ScopeSingleton.service.impl;

import kg.megacom.ScopeSingleton.Author;
import kg.megacom.ScopeSingleton.Person;
import kg.megacom.ScopeSingleton.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype") // в ответе получим false
public class PersonServiceImpl implements PersonService {

    @Override
    public Person getPerson() {
        return new Person("IMPL-1",11);
    }

    @Override
    public String toString() {
        return "PersonServiceImpl1{" +
                "name='"+ getPerson().getName() +"\'"+
                ", age='"+ getPerson().getAge() +"'}";
    }
}
