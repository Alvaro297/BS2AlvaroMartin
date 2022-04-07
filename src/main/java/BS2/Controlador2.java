package BS2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("URL/controlador2")
public class Controlador2 {

    @Autowired
    PersonInterface personInterface;

    @Autowired
    CityInterface cityInterface;

    @GetMapping("getPersona")
    public Person getPersona(){
        personInterface.setAge(personInterface.getAge()*2);
        return personInterface.getPerson();
    }

    @GetMapping("getCiudad")
    public List<City> getCiudadLista(){
        return cityInterface.listCiudad();
    }

    @Autowired
    @Qualifier("bean1")
    Person person1;

    @Autowired
    @Qualifier("bean2")
    Person person2;

    @Autowired
    @Qualifier("bean3")
    Person person3;

    @GetMapping("bean/{bean}")
    public Person getBean(@PathVariable String bean) {
        switch (bean) {
            case "bean1" -> {
                return person1;
            }
            case "bean2" -> {
                return person2;
            }
            case "bean3" -> {
                return person3;
            }
            default -> {
                return new Person();
            }
        }
    }

}
