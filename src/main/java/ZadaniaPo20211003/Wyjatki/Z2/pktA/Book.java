package ZadaniaPo20211003.Wyjatki.Z2.pktA;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    int isbn;
    String tytul;
    String autor;
    int rokWydania;

    @Override
    public String toString() {
        return " isbn=" + isbn +
                ", tytul='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                ", rokWydania=" + rokWydania +
                '\n';
    }
}
