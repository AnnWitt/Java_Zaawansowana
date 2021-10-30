package z20211023_funkcyjne.Optionale.BibliotekiZOptionalami;

public class ExeptionJawny extends Exception{
    public ExeptionJawny() {
        super("Nie znaleziono ksiazki");
    }

    public void setStackTrace() {
        System.out.println("ddd");
    }
}
