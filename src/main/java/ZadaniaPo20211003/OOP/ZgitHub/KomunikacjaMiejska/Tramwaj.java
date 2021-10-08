package ZadaniaPo20211003.OOP.ZgitHub.KomunikacjaMiejska;

public class Tramwaj extends Pojazdy{
    int ileWagonow;


    @Override
    public Zajezdnie getZajezdnie() {
        return super.getZajezdnie();
    }

    public Tramwaj(int lp, int maxSpeed, TypyPojazdow typPojazdu, Zajezdnie zajezdnie, int ileWagonow) {
        super(lp, maxSpeed, typPojazdu, zajezdnie);
        this.ileWagonow = ileWagonow;
    }
}
