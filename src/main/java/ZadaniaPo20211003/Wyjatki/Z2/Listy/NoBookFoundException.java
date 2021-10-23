package ZadaniaPo20211003.Wyjatki.Z2.Listy;

public class NoBookFoundException extends Exception{
    public NoBookFoundException() {
        super("Brak książki");
    }
}
