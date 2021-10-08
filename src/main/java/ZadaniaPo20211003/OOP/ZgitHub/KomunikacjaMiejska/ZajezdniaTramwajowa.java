package ZadaniaPo20211003.OOP.ZgitHub.KomunikacjaMiejska;

 class ZajezdniaTramwajowa extends Zajezdnie {
    IleWagonow ogolnaLiczbaWagonow;

    @Override
     TypyPojazdow getTypyPojazdow() {
        return TypyPojazdow.TRAMWAJ;
    }

    @Override
     NazwyZajezdni getNazwaZajezdni() {
        return NazwyZajezdni.ZAJEZDNIA2;
    }

     ZajezdniaTramwajowa(NazwyZajezdni nazwaZajezdni, TypyPojazdow typyPojazdow) {
        super(nazwaZajezdni, typyPojazdow);
        this.ogolnaLiczbaWagonow = ogolnaLiczbaWagonow;
    }
}
