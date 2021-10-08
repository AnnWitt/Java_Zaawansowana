package ZadaniaPo20211003.OOP.ZgitHub.KomunikacjaMiejska;

 class ZajezdniaAutobusowa extends Zajezdnie{
    double sumaryczneZuzyciePaliwa=10;

    @Override
     TypyPojazdow getTypyPojazdow() {
        return TypyPojazdow.AUTOBUS;
    }

    @Override
     NazwyZajezdni getNazwaZajezdni() {
        return NazwyZajezdni.ZAJEZDNIA1;
    }

     ZajezdniaAutobusowa(NazwyZajezdni nazwaZajezdni, TypyPojazdow typyPojazdow) {
        super(nazwaZajezdni, typyPojazdow);
        this.sumaryczneZuzyciePaliwa = sumaryczneZuzyciePaliwa;
    }



}
