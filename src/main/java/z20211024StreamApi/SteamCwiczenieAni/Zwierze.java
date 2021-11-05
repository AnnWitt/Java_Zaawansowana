package z20211024StreamApi.SteamCwiczenieAni;

import java.util.List;

public class Zwierze {
    public ZwierzeGatunek gatunek;
    List<Body> bodies;
    public String Imie;

    public Zwierze(ZwierzeGatunek gatunek, List<Body> body, String imie) {
        this.gatunek = gatunek;
        this.bodies = body;
        this.Imie = imie;
    }

    public ZwierzeGatunek getGatunek() {
        return gatunek;
    }

    public void setGatunek(ZwierzeGatunek gatunek) {
        this.gatunek = gatunek;
    }

    public List<Body> getBodies() {
        return bodies;
    }

    public void setBodies(List<Body> bodies) {
        this.bodies = bodies;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    @Override
    public String toString() {
        return "Zwierze{" +
                "gatunek=" + gatunek +
                ", body=" + bodies +
                ", Imie='" + Imie + '\'' +
                '}';
    }
}
