package ZadaniaPo20211003.OOP.ZgitHub.Autostrada;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/*Przyjmij pewną stałą kwotę do zapłaty za czas spędzony na autostradzie. Im szybciej
        wyjedziemy tym mniej zapłacimy.*/

 class Highway {

    Map<String, VehicleInfo> mapaPojazdow = new HashMap<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    double cenaPerSec;
    Duration CzasPrzejazdu;
    double DoZaplaty =0;



/*     - metodę vehicleEntry(String numer_rejestracyjny, oraz CarType type) -
    która dodaje do kolekcji nową instancję VehicleInfo oraz wypisuje do
        konsoli komunikat. Metoda nic nie zwraca.*/

/*    String numerRejestracyjny;
    CarType typPojazdu;
    LocalDateTime dataWjazdu;
    */

    void vehicleEntry(String numer_rejestracyjny, CarType carType) {
        //pole z data z automatu

        if (mapaPojazdow.containsKey(numer_rejestracyjny)==true) {
            System.out.println("Na autostradzie już jest pojazd o tym numerze rejestracyjnym. Jest to " + mapaPojazdow.get(numer_rejestracyjny).typPojazdu);
        } else {
            VehicleInfo v1 = new VehicleInfo(numer_rejestracyjny, carType, LocalDateTime.now());
            mapaPojazdow.put(numer_rejestracyjny, v1);
            System.out.println("Dodano pojazd o numerze " + numer_rejestracyjny + " | typ " +
                    carType + " | Wjazd o " + v1.dataWjazdu.format(formatter));
        }
    }

    void searchVehicle(String numer_rejestracyjny) {
        if (mapaPojazdow.containsKey(numer_rejestracyjny) == true) {
            System.out.println("Pojazd o numerze rejestracyjnym: " + numer_rejestracyjny + " znajduje się na autostradzie. Jest to " + mapaPojazdow.get(numer_rejestracyjny).typPojazdu);
        } else {
            System.out.println("Nie znaleziono pojazdu na autostradzie");
        }
    }

    void vehicleLeave(String numer_rejestracyjny) {

        if (mapaPojazdow.containsKey(numer_rejestracyjny) == false) {
            System.out.println(numer_rejestracyjny + " samochodu nie ma na autostradzie");
        } else {
            VehicleInfo v2=new VehicleInfo(numer_rejestracyjny,mapaPojazdow.get(numer_rejestracyjny).typPojazdu, mapaPojazdow.get(numer_rejestracyjny).getDataWjazdu());
            switch (mapaPojazdow.get(numer_rejestracyjny).typPojazdu) {
                case CAR: {
                    cenaPerSec =0.025;
                    break;
                }
                case TRUCK: {
                    cenaPerSec =0.03;
                    break;
                }
                case MOTORCYCLE: {
                    cenaPerSec =0.001;
                    break;

                }
            }
            int randomMinutes=(int)((Math.random()*300)+1);
            v2.dataZjazdu=LocalDateTime.now().plusMinutes(randomMinutes);
            CzasPrzejazdu =Duration.between(v2.getDataWjazdu(),v2.dataZjazdu);
            DoZaplaty =(double) CzasPrzejazdu.toSeconds()*cenaPerSec;
            System.out.println("Pojazd "+ numer_rejestracyjny + " wjechał na autostradę " + v2.dataWjazdu.format(formatter) +
                    " a zjechał z autostrady " + v2.dataZjazdu.format(formatter) + ". Czas przejazdu w minutach: " + CzasPrzejazdu.toMinutes() + " do zaplaty " + DoZaplaty + " zł - cena per sec " + cenaPerSec);
            mapaPojazdow.remove(numer_rejestracyjny);
        }
    }

}
