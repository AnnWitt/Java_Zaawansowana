package z20211017.Autostrada;

import java.util.HashMap;
import java.util.Map;

/*Przyjmij pewną stałą kwotę do zapłaty za czas spędzony na autostradzie. Im szybciej
        wyjedziemy tym mniej zapłacimy.*/

public class Highway {

    Map<String, CarType> mapaPojazdow = new HashMap<>();
//String, Vehicle info

    void vehicleEntry(String numer_rejestracyjny, CarType carType) {
        //pole z data z automatu
        mapaPojazdow.put(numer_rejestracyjny, carType);
        System.out.println("Dodano pojazd " + numer_rejestracyjny + " " + carType);
    }

    void searchVehicle(String numer_rejestracyjny) {
        if (mapaPojazdow.containsKey(numer_rejestracyjny) == true) {
            System.out.println(numer_rejestracyjny + " " +
                    mapaPojazdow.get(numer_rejestracyjny) + " znajduje się na autostradzie ");
        } else {
            System.out.println("Nie znaleziono pojazdu na autostradzie");
        }
    }

    void vehicleLeave(String numer_rejestracyjny) {

        if (mapaPojazdow.containsKey(numer_rejestracyjny)==false) {
            System.out.println(numer_rejestracyjny + " samochodu nie ma na autostradzie");
        } else {
            mapaPojazdow.remove(numer_rejestracyjny);
            System.out.println(numer_rejestracyjny + " Pojazd zjechał z autostrady");
        }


    }

}
