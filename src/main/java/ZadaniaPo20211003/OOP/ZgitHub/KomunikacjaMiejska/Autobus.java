package ZadaniaPo20211003.OOP.ZgitHub.KomunikacjaMiejska;

public class Autobus extends Pojazdy{
    double zuzyciePaliwa;

    @Override
    public Zajezdnie getZajezdnie() {
        return super.getZajezdnie();
    }

    @Override
    public TypyPojazdow getTypPojazdu() {
        return TypyPojazdow.AUTOBUS;
    }

    public Autobus(int lp, int maxSpeed, TypyPojazdow typPojazdu, double zuzyciePaliwa,Zajezdnie zajezdnie) {
        super(lp, maxSpeed, typPojazdu, zajezdnie);
        this.zuzyciePaliwa = zuzyciePaliwa;
    }
}
