package ZadaniaPo20211003.Wyjatki.Z2;

public class NoBookFoundException extends Exception{
    public NoBookFoundException() {
        super("Brak książki");
    }
}
