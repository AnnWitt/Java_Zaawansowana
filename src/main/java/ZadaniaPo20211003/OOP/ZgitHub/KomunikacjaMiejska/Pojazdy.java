package ZadaniaPo20211003.OOP.ZgitHub.KomunikacjaMiejska;

public abstract class Pojazdy {
    int lp, maxSpeed;
    TypyPojazdow typPojazdu;
    Zajezdnie zajezdnie;

    public Zajezdnie getZajezdnie() {
        return zajezdnie;
    }

    public Pojazdy(int lp, int maxSpeed, TypyPojazdow typPojazdu, Zajezdnie zajezdnie) {
        this.lp = lp;
        this.maxSpeed = maxSpeed;
        this.zajezdnie=zajezdnie;
        this.typPojazdu = typPojazdu;
    }

    public int getLp() {
        return lp;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public TypyPojazdow getTypPojazdu() {
        return typPojazdu;
    }

    //zna tez swoja zajezdnie




}
