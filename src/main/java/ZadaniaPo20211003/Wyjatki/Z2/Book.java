package ZadaniaPo20211003.Wyjatki.Z2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    int licznikB;
    int isbn;
    String tytul;
    String autor;
    int rokWydania;


    public Book(int isbn, String tytul, String autor, int rokWydania) {
        this.isbn = isbn;
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }

    @Override
    public String toString() {
        return "Book{" + licznikB+
                " -> isbn=" + isbn +
                ", tytul='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                ", rokWydania=" + rokWydania + " "+ '\n';
    }


}
