package ZadaniaPo20211003.Wyjatki.Z2.pktMapyOptionale;

import java.util.Optional;

public class MainBookRepository {
    public static void main(String[] args) {

        BookRepository repo1 = new BookRepository();
        Book b1 = new Book(444, "tytul1", "autor1", 2010);
        Book b2 = new Book(1234413, "tytul2", "autor2", 2000);
        Book b3 = new Book(1232213, "tytul3", "autor3", 2003);


        repo1.bookAdd(b1);
        repo1.bookAdd(b2);
        repo1.bookAdd(b3);
        System.out.println(repo1.mapRepo);

        repo1.bookDeletePoISBN(444);
        System.out.println(repo1.mapRepo);
        repo1.bookDeletePoISBN(444);
        System.out.println(repo1.mapRepo);




       /* System.out.println(BookRepository.mapRepo.keySet());
        System.out.println(BookRepository.mapRepo.containsValue(b1));
        System.out.println(repo1.mapRepo);*/


    }
}
