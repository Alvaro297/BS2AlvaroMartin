package BS2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonaBean {

    @Bean("bean1")
    public Person getPersona() {
        PersonInterface personService = new PersonServicerImp();
        personService.setName("bean1");
        personService.setAge(1);
        personService.setPopulation("Madrid");
        return personService.getPerson();
    }

    @Bean("bean2")
    public Person getPerson2() {
        PersonInterface personService = new PersonServicerImp();
        personService.setName("bean2");
        personService.setAge(2);
        personService.setPopulation("Londres");
        return personService.getPerson();
    }

    @Bean("bean3")
    public Person getPerson3() {
        PersonInterface personService = new PersonServicerImp();
        personService.setName("bean3");
        personService.setAge(3);
        personService.setPopulation("Roma");
        return personService.getPerson();
    }
}