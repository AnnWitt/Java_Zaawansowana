package ZadaniaPo20211003.Wyjatki.Z2.pktA;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;

@Data
@AllArgsConstructor
public class BookRepository {
    Book book;
    static int licznik = 0;
    static HashMap<Integer, Book> mapRepo = new HashMap<>();

    public BookRepository() {

    }
    // HashMap<Integer, Book> bookRepositoryMap=new HashMap<>();


    //static wpsoldzielone przez wszystkie
    public void bookAdd(Book book) {
        mapRepo.put(licznik,book);
        licznik++;
    }






}
