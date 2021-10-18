package ZadaniaPo20211003.OOP.ZgitHub.Daty;

import java.time.Duration;
import java.time.LocalDate;

 class Wydarzenie {
     //------- niepotrzebne :O
    LocalDate dataWydarzenia;
    String nazwaWydarzenia;
    //------
    LocalDate now = LocalDate.now();
    Duration between;


    int ileZostaloLat(LocalDate dataWydarzenia) {
        return ileZostaloMiesiecy(dataWydarzenia) / 12;
    }

    int ileZostaloMiesiecy(LocalDate dataWydarzenia) {
        return ileZostaloDni(dataWydarzenia) / 30;
    }

    int ileZostaloDni(LocalDate dataWydarzenia) {
        between = Duration.between(now.atStartOfDay(), dataWydarzenia.atStartOfDay());
        return (int) between.toDays();
    }


}
