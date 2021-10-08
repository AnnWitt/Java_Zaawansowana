package ZadaniaPo20211003.OOP.ZgitHub.KomunikacjaMiejska;

 abstract class Pojazdy {
    int lp, maxSpeed;
    TypyPojazdow typPojazdu;
    Zajezdnie zajezdnie;

     Zajezdnie getZajezdnie() {
        return zajezdnie;
    }

     Pojazdy(int lp, int maxSpeed, TypyPojazdow typPojazdu, Zajezdnie zajezdnie) {
        this.lp = lp;
        this.maxSpeed = maxSpeed;
        this.zajezdnie=zajezdnie;
        this.typPojazdu = typPojazdu;
    }

     int getLp() {
        return lp;
    }

     int getMaxSpeed() {
        return maxSpeed;
    }

     TypyPojazdow getTypPojazdu() {
        return typPojazdu;
    }

    //zna tez swoja zajezdnie




}
