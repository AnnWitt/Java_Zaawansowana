package ZadaniaPo20211003.Wyjatki.Z2;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class BookRepository {
    Book book;
    public static int licznik = 0;
    static List<Book> listrepo = new ArrayList<>();

    public BookRepository() {

    }


    //static wpsoldzielone przez wszystkie
    public void bookAdd(Book book) {
        listrepo.add(book);
        licznik++;
        book.licznikB = licznik;
    }

    public void bookDelete(Book book) {
        listrepo.remove(book);
        book.licznikB = licznik;
    }


    public void bookSearchTitle(String s) {
        boolean isBook = false;
        try {
            for (Book arg : listrepo
            ) {
                if (arg.tytul.equals(s)) {
                    System.out.println("ksiazke znaleziono");
                    isBook = true;
                    break;
                }
            }
            if (isBook == false) {
                throw new NoBookFoundException();
            }
        } catch (NoBookFoundException d) {
            System.out.println(d.getMessage());

        }
    }


    public void bookSearchID(int i) {
        boolean isBook = false;
        try {
            for (Book argbook : listrepo
            ) {
                if (argbook.licznikB==i) {
                    System.out.println("ksiazke znaleziono");
                    isBook = true;
                    break;
                }
            }
            if (isBook == false) {
                throw new NoBookFoundException();
            }
        } catch (NoBookFoundException d) {
            System.out.println(d.getMessage());

        }


    }

    public void bookDeleteByID(int i) {
        boolean isBook = false;
        try {
            for (Book argbook : listrepo
            ) {
                if (argbook.licznikB==i) {
                    listrepo.remove(argbook);
                    System.out.println("ksiazke usunieto");
                    isBook = true;
                    break;
                }
            }
            if (isBook == false) {
                throw new NoBookFoundException();
            }
        } catch (NoBookFoundException d) {
            System.out.println(d.getMessage());

        }

    }



}
