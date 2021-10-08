package ZadaniaPo20211003.OOP.ZgitHub.KomunikacjaMiejska;

public class ZajezdniaAutobusowa extends Zajezdnie{
    double sumaryczneZuzyciePaliwa=10;

    @Override
    public TypyPojazdow getTypyPojazdow() {
        return TypyPojazdow.AUTOBUS;
    }

    @Override
    public NazwyZajezdni getNazwaZajezdni() {
        return NazwyZajezdni.ZAJEZDNIA1;
    }

    public ZajezdniaAutobusowa(NazwyZajezdni nazwaZajezdni, TypyPojazdow typyPojazdow) {
        super(nazwaZajezdni, typyPojazdow);
        this.sumaryczneZuzyciePaliwa = sumaryczneZuzyciePaliwa;
    }



}
