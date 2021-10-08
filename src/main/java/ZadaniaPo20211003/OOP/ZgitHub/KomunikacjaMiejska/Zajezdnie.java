package ZadaniaPo20211003.OOP.ZgitHub.KomunikacjaMiejska;

 abstract class Zajezdnie {
    NazwyZajezdni nazwaZajezdni;
    TypyPojazdow typyPojazdow;

     Zajezdnie(NazwyZajezdni nazwaZajezdni, TypyPojazdow typyPojazdow) {
        this.nazwaZajezdni = nazwaZajezdni;
        this.typyPojazdow = typyPojazdow;
    }

     TypyPojazdow getTypyPojazdow() {
        return typyPojazdow;
    }

     NazwyZajezdni getNazwaZajezdni() {
        return nazwaZajezdni;
    }
}
