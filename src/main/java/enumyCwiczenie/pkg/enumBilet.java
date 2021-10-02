package enumyCwiczenie.pkg;

public enum enumBilet {
    ULGOWY(1.6d),
    NORMALNY(3.2d),
    RODZINNY(4.2d);

    double getCena() {
        return cena;
    }

    public double cena;

    enumBilet(double cena) {
        this.cena=cena;
    }



//robimy konstruktor ale niejawny /9tylko tak mozna

}
