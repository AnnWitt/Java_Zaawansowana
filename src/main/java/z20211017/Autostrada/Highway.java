package z20211017.Autostrada;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/*Przyjmij pewną stałą kwotę do zapłaty za czas spędzony na autostradzie. Im szybciej
        wyjedziemy tym mniej zapłacimy.*/

public class Highway {

    Map<String, VehicleInfo> mapaPojazdow = new HashMap<>();

    void vehicleEntry(String numer_rejestracyjny, CarType carType) {
        //pole z data z automatu
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        VehicleInfo v1=new VehicleInfo(numer_rejestracyjny,carType,LocalDateTime.now());
        mapaPojazdow.put(numer_rejestracyjny,v1);
        System.out.println("Dodano pojazd o numerze " + numer_rejestracyjny + " | typ " +
                carType + " | Wjazd o " + v1.dataWjazdu.format(formatter));
    }

    void searchVehicle(String numer_rejestracyjny) {
        if (mapaPojazdow.containsKey(numer_rejestracyjny) == true) {
            System.out.println(numer_rejestracyjny + " " +
                    mapaPojazdow.get(numer_rejestracyjny) + " znajduje się na autostradzie ");
        } else {
            System.out.println("Nie znaleziono pojazdu na autostradzie");
            //tu moznaby throw new i exception
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
