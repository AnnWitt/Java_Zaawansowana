package z20211023.Optionale.BibliotekiZOptionalami;

public class IllegalSurnameEx extends IllegalArgumentException{
    //mozna konstruktor ale nie trzeba

    public IllegalSurnameEx(String s) { //niejawny - nie wymusza
        super("Niepowrawna warosc w nazwisku " + s);
    } //jezeli wiecej niejawnych to kazdy w osobnej klasie


}
