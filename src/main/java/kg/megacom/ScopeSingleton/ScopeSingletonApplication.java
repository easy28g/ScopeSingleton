package kg.megacom.ScopeSingleton;

import kg.megacom.ScopeSingleton.service.PersonService;
import kg.megacom.ScopeSingleton.service.impl.PersonServiceImpl;
import kg.megacom.ScopeSingleton.service.impl.PersonServiceImpl2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ScopeSingletonApplication {

	public static void main(String[] args) {

	    SpringApplication.run(ScopeSingletonApplication.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);

//        Person person = (Person) context.getBean("person");
//        System.out.println(person);


        Author author = context.getBean("author", Author.class);
        author.testPersonService();

        Author author1 = context.getBean("author", Author.class);
        author1.testPersonService();

        System.out.println(author.equals(author1));


//        PersonService personImpl = context.getBean("personServiceImpl", PersonServiceImpl.class);
//        System.out.println(personImpl.getPerson());
//
//        PersonService personImpl3 = context.getBean("personServiceImpl", PersonServiceImpl.class);
//        System.out.println(personImpl3.getPerson());
//
//        System.out.println(personImpl.equals(personImpl3));

	}

}
