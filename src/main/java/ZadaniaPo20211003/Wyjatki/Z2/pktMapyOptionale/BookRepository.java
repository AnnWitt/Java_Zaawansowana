package ZadaniaPo20211003.Wyjatki.Z2.pktMapyOptionale;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Optional;
import java.util.function.Supplier;

@Data
@AllArgsConstructor
public class BookRepository {
    Book book;
    static HashMap<Integer, Book> mapRepo = new HashMap<Integer, Book>();
    Optional<Boolean> optionalBoolean;

    public BookRepository() {

    }

    public void bookAdd(Book book) {
        mapRepo.put(book.isbn, book);
    }

    public void bookDeletePoISBN(int isbn) {
        if (mapRepo.containsKey(isbn)) {
            mapRepo.remove(isbn);
        } else {
            //tu bez sensu - doczytaj https://java.pl.sdacademy.pro/e-podrecznik/wprowadzenie/
        }
    }

    public Supplier SPL;

    /*    public interface Supplier<T> {
     * Gets a result.
     * @return a result
     *//*
        T get();
    }*/


}
