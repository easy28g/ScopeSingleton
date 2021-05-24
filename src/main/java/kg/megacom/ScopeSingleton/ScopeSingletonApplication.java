package kg.megacom.ScopeSingleton;

import kg.megacom.ScopeSingleton.service.PersonService;
import kg.megacom.ScopeSingleton.service.impl.PersonServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ScopeSingletonApplication {

	public static void main(String[] args) {

	    SpringApplication.run(ScopeSingletonApplication.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);

        Person person = (Person) context.getBean("person");
        System.out.println(person);

        Author author = context.getBean("author", Author.class);
        System.out.println(author);

        PersonService personService = context.getBean("personServiceImpl", PersonServiceImpl.class);
        System.out.println(personService.getPerson());
	}

}
