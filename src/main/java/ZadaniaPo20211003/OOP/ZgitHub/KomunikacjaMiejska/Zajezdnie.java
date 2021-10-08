package ZadaniaPo20211003.OOP.ZgitHub.KomunikacjaMiejska;

public abstract class Zajezdnie {
    NazwyZajezdni nazwaZajezdni;
    TypyPojazdow typyPojazdow;

    public Zajezdnie(NazwyZajezdni nazwaZajezdni, TypyPojazdow typyPojazdow) {
        this.nazwaZajezdni = nazwaZajezdni;
        this.typyPojazdow = typyPojazdow;
    }

    public TypyPojazdow getTypyPojazdow() {
        return typyPojazdow;
    }

    public NazwyZajezdni getNazwaZajezdni() {
        return nazwaZajezdni;
    }
}
