package z20211003.BibliotekaZwiazki.pkg;

public class ExeptionJawny extends Exception{
    public ExeptionJawny() {
        super("Nie znaleziono ksiazki");
    }

    public void setStackTrace() {
        System.out.println("ddd");
    }
}
