package ZadaniaPo20211003.Wyjatki.Z2;

public class MainBookRepository {
    public static void main(String[] args) throws NoBookFoundException {
        //HashMap<Integer, Book> bookrepository=new HashMap<>();

        BookRepository repo1 = new BookRepository();
        Book b1 = new Book(123213213, "tytul1", "autor1", 2010);
        Book b2 = new Book(1234413, "tytul2", "autor2", 2000);
        Book b3 = new Book(1232213, "tytul3", "autor3", 2003);
        Book b4 = new Book(999, "tytul3", "autor3", 2003);


        repo1.bookAdd(b1);
        repo1.bookAdd(b2);
        repo1.bookAdd(b3);

        System.out.println(BookRepository.listrepo);
        repo1.bookDelete(b2);
        System.out.println(BookRepository.listrepo);
        repo1.bookAdd(b4);
        System.out.println(BookRepository.listrepo);

        System.out.println("Po tytule");
        repo1.bookSearchTitle("ty4tul3");
        repo1.bookSearchTitle("tytul3");
        // repo1.bookSearch("tytul1");

        System.out.println("po numerze");
        repo1.bookSearchID(3);
        repo1.bookSearchID(2);

        repo1.bookDeleteByID(4);
        System.out.println(BookRepository.listrepo);

    }
}
