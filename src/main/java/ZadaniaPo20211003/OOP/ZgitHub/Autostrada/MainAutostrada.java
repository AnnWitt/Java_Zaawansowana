package ZadaniaPo20211003.OOP.ZgitHub.Autostrada;

import java.util.Locale;
import java.util.Scanner;

 class MainAutostrada {
    public static void main(String[] args) {

        Highway highway = new Highway();
        //Scanner scanner = new Scanner(System.in);

        highway.vehicleEntry("2222", CarType.CAR);
        highway.vehicleEntry("2442", CarType.CAR);
        highway.vehicleEntry("33", CarType.TRUCK);
        highway.vehicleEntry("2445", CarType.MOTORCYCLE);

        System.out.println(highway.mapaPojazdow);
        boolean continueApp = true;
        //Thread sleep, timeunits seconds sleep

        while (continueApp == true) {
            Scanner scanner = new Scanner(System.in);
            String akcja;
            System.out.println("Wybierz akcję: wjazd , wyjazd , sprawdz, zakoncz");
            akcja = scanner.nextLine();
                    try {
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
                            case "zakoncz": {
                                continueApp = false;
                                System.out.println("Zakończono program");
                                break;
                            }
                            default: {
                                System.out.println("Wybrano nieprawidłowa akcję");
                                break;
                            }
                        }
                    } catch (Exception exception) {
                        System.out.println("Nieznany typ pojazdu");
                    }
        }



    }
}
