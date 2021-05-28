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


//        Author author = context.getBean("author", Author.class);
//        System.out.println(author.getPerson());

//        PersonService impl1 = context.getBean("personServiceImpl", PersonServiceImpl.class);
//        System.out.println(impl1.getPerson());
//
//        PersonService impl2 = context.getBean("personServiceImpl2", PersonServiceImpl2.class);
//        System.out.println(impl2.getPerson());

        Author author = context.getBean("author", Author.class);
        System.out.println(author.getPerson());

//        PersonService personImpl = context.getBean("personServiceImpl", PersonServiceImpl.class);
//        System.out.println(personImpl.getPerson());
//
//        PersonService personImpl2 = context.getBean( "personServiceImpl2" ,PersonServiceImpl2.class);
//        System.out.println(personImpl2.getPerson());


	}

}
