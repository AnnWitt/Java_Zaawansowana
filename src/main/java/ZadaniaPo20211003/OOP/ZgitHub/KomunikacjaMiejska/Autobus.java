package ZadaniaPo20211003.OOP.ZgitHub.KomunikacjaMiejska;

 class Autobus extends Pojazdy{
    double zuzyciePaliwa;

    @Override
     Zajezdnie getZajezdnie() {
        return super.getZajezdnie();
    }

    @Override
     TypyPojazdow getTypPojazdu() {
        return TypyPojazdow.AUTOBUS;
    }

     Autobus(int lp, int maxSpeed, TypyPojazdow typPojazdu, double zuzyciePaliwa,Zajezdnie zajezdnie) {
        super(lp, maxSpeed, typPojazdu, zajezdnie);
        this.zuzyciePaliwa = zuzyciePaliwa;
    }





}
