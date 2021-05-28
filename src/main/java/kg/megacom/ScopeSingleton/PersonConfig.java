package kg.megacom.ScopeSingleton;

import kg.megacom.ScopeSingleton.service.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Author.class)
public class PersonConfig {

    @Bean(name = "person")
    public Person getPerson(){
        return new Person("Azamat", 22);
    }


//    @Bean(name = "name")
//    public String getName(){
//        return "Azamat-1";
//    }
//
//    @Bean(name = "age")
//    public int getInt(){
//        return 22;
//    }

}
