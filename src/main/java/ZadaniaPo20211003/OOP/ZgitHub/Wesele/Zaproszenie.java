package ZadaniaPo20211003.OOP.ZgitHub.Wesele;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@AllArgsConstructor
@Data
public class Zaproszenie {
    String imie;
    String nazwisko;
    TypZaproszenia typZaproszenia;

    @Override
    public String toString() {
        return "\n"+"imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", typZaproszenia=" + typZaproszenia;
    }
}
