package ZadaniaPo20211003.OOP.ZgitHub.KomunikacjaMiejska;

 class Tramwaj extends Pojazdy{
    IleWagonow ileWagonow;


    @Override
     Zajezdnie getZajezdnie() {
        return super.getZajezdnie();
    }

     Tramwaj(int lp, int maxSpeed, TypyPojazdow typPojazdu, Zajezdnie zajezdnie, IleWagonow ileWagonow) {
        super(lp, maxSpeed, typPojazdu, zajezdnie);
        this.ileWagonow = ileWagonow;
    }
}
