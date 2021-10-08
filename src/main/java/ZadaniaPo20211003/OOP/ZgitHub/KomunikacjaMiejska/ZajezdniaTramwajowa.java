package ZadaniaPo20211003.OOP.ZgitHub.KomunikacjaMiejska;

public class ZajezdniaTramwajowa extends Zajezdnie {
    int ogolnaLiczbaWagonow=7;

    @Override
    public TypyPojazdow getTypyPojazdow() {
        return TypyPojazdow.TRAMWAJ;
    }

    @Override
    public NazwyZajezdni getNazwaZajezdni() {
        return NazwyZajezdni.ZAJEZDNIA2;
    }

    public ZajezdniaTramwajowa(NazwyZajezdni nazwaZajezdni, TypyPojazdow typyPojazdow, int ogolnaLiczbaWagonow) {
        super(nazwaZajezdni, typyPojazdow);
        this.ogolnaLiczbaWagonow = ogolnaLiczbaWagonow;
    }
}
