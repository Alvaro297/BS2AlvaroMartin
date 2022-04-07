package BS2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("URL/controlador1/add")
public class Controlador1 {

    @Autowired
    PersonInterface personInterface;

    @Autowired
    CityInterface cityInterface;

    @GetMapping("/Person/{name}/{population}/{age}")
    public Person addPerson(@PathVariable String name, @PathVariable String population, @PathVariable int age){
        personInterface.setName(name);
        personInterface.setPopulation(population);
        personInterface.setAge(age);
        return personInterface.getPerson();
    }

    @PostMapping("Ciudad")
    public void addCiudad(@RequestBody City city){
        cityInterface.addCiudad(city);
    }


}
