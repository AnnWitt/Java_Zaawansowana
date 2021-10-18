package ZadaniaPo20211003.OOP.ZgitHub.Daty;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


class DataMetody {


    static DateTimeFormatter f1 = DateTimeFormatter.ofPattern("d.MM.yyyy");
    static DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    static DateTimeFormatter f3 = DateTimeFormatter.ofPattern("* dd MMM yyyy");

    static void wyswietlDate(int dzien, int miesiac, int rok) {
        LocalDate data = LocalDate.of(rok, miesiac, dzien);

        System.out.println(f1.format(data));
        System.out.println(f2.format(data));
        System.out.println(f3.format(data));
    }

}
