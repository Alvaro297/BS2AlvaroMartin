package BS2;

import java.util.List;

public interface CityInterface {
    String getName();
    void setName(String ciudad);
    int getNumeroHabitantes();
    void setNumeroHabitantes(int numeroHabitantes);
    void addCiudad(City ciudad);
    List<City> listCiudad();
    City getCiudad();
}