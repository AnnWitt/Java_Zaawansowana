package z20211017.Autostrada.AW2;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class MainAutostrada {
    public static void main(String[] args) {
        LocalDateTime d1 = LocalDateTime.now();

        Highway highway = new Highway();
        Scanner scanner = new Scanner(System.in);

        highway.vehicleEntry("2222", CarType.CAR);
        highway.vehicleEntry("2442", CarType.CAR);
        highway.vehicleEntry("33", CarType.TRUCK);
        highway.vehicleEntry("2445", CarType.MOTORCYCLE);

        System.out.println(highway.mapaPojazdow);

        //Thread sleep, timeunits seconds sleep
        System.out.println("Wybierz akcję: wjazd , wyjazd , sprawdz");
        String akcja = scanner.nextLine();
        switch (akcja) {
            case "wjazd": { //- wjazd NR_REJESTRACYJNY TYP
                System.out.println("Podaj nr rejestracyjny  oraz typ pojazdu rozdzielone spacją (CAR/TRUNK/MOTORCYCLE)");
                String inputAkcji = scanner.nextLine();
                String[] inputTbl = inputAkcji.split(" ");
                String numerRejestracyjnyWprowadzony = inputTbl[0];
                String typAutaWprowadzony = inputTbl[1].toUpperCase(Locale.ROOT); //ale powinien byc Cartype
                CarType typAutaKonw = CarType.valueOf(typAutaWprowadzony);
                highway.vehicleEntry(numerRejestracyjnyWprowadzony, typAutaKonw);
                break;
            }
            case "wyjazd": { //- wyjazd NR_REJESTRACYJNY
                System.out.println("Podaj nr rejestracyjny wyjeżdzającego pojazdu");
                String inputAkcji = scanner.next();
                highway.vehicleLeave(inputAkcji);
                break;
            }
            case "sprawdz": { // - sprawdz NR_REJESTRACYJNY
                System.out.println("Podaj numer rejestracyjny");
                String inputAkcji = scanner.next();
                highway.searchVehicle(inputAkcji);
                break;
            }
            default: {
                System.out.println("Wybrano nieprawidłowa akcję");
                break;
            }
        }



/*      //  System.out.println("mapa" + highway.mapaPojazdow);
        highway.searchVehicle("3333");
        highway.searchVehicle("33");
        System.out.println(highway.mapaPojazdow);
        highway.vehicleLeave("4444");
        highway.vehicleLeave("33");
        System.out.println(highway.mapaPojazdow);

        LocalDateTime d2 = LocalDateTime.now();
        System.out.println("d1 " + d1.format(formatter) + "\nd2 " + d2.format(formatter));

        System.out.println((Duration.between(d1, d2)).toMinutes());
        System.out.println((Duration.between(d1, d2)).toSeconds());
        System.out.println((Duration.between(d1, d2)).toNanos());*/
    }
}
