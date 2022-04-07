package BS2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityServiceImp implements CityInterface {
    List<City> listCity = new ArrayList<>();

    City city = new City();


    @Override
    public String getName() {
        return city.getName();
    }

    @Override
    public void setName(String name) {
        city.setName(name);
    }

    @Override
    public int getNumeroHabitantes() {
        return city.getNumeroHabitantes();
    }

    @Override
    public void setNumeroHabitantes(int numeroHabitantes) {
        city.setNumeroHabitantes(numeroHabitantes);
    }

    @Override
    public void addCiudad(City city) {
        listCity.add(city);
    }

    @Override
    public List<City> listCiudad() {
        return this.listCity;
    }

    @Override
    public City getCiudad() {
        return this.city;
    }
}
