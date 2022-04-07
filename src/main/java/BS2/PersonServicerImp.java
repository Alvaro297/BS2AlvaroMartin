package BS2;

import org.springframework.stereotype.Service;

@Service
public class PersonServicerImp implements PersonInterface {

    Person person=new Person();

    public String getName(){
        return person.getName();
    }

    public void setName(String name){
        person.setName(name);
    }

    public String getPopulation() {
        return person.getPopulation();
    }

    public void setPopulation(String population) {
        person.setPopulation(population);
    }

    @Override
    public int getAge() {
        return person.getAge();
    }

    @Override
    public void setAge(int age) {
        person.setAge(age);
    }

    @Override
    public Person getPerson() {
        return this.person;
    }

}
