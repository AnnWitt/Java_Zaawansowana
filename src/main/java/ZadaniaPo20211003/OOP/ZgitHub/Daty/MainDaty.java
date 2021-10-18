package ZadaniaPo20211003.OOP.ZgitHub.Daty;

import java.time.LocalDate;

class MainDaty {

    public static void main(String[] args) {
        DataMetody.wyswietlDate(1, 11, 2011);
        Wydarzenie wydarzenie = new Wydarzenie();
        LocalDate data = LocalDate.of(2022, 6, 3);
        System.out.println("Zostało dni: " + wydarzenie.ileZostaloDni(data));
        System.out.println("Zostało miesięcy: " + wydarzenie.ileZostaloMiesiecy(data));
        System.out.println("Zostało lat: " + wydarzenie.ileZostaloLat(data));


    }

}
