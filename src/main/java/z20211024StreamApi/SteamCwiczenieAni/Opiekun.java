package z20211024StreamApi.SteamCwiczenieAni;

import java.util.List;

public class Opiekun {
    public String ImieOpiekuna;
    public Integer wiekOpiekuna;
    List<Zwierze> zwierzeta;

    public String getImieOpiekuna() {
        return ImieOpiekuna;
    }

    public void setImieOpiekuna(String imieOpiekuna) {
        ImieOpiekuna = imieOpiekuna;
    }

    public Integer getWiekOpiekuna() {
        return wiekOpiekuna;
    }

    public void setWiekOpiekuna(Integer wiekOpiekuna) {
        this.wiekOpiekuna = wiekOpiekuna;
    }

    public List<Zwierze> getZwierzeta() {
        return zwierzeta;
    }

    public void setZwierzeta(List<Zwierze> zwierzeta) {
        this.zwierzeta = zwierzeta;
    }

    public Opiekun(String imieOpiekuna, Integer wiekOpiekuna, List<Zwierze> zwierze) {
        ImieOpiekuna = imieOpiekuna;
        this.wiekOpiekuna = wiekOpiekuna;
        this.zwierzeta = zwierze;
    }


    @Override
    public String toString() {
        return "Opiekun{" +
                "ImieOpiekuna='" + ImieOpiekuna + '\'' +
                ", wiekOpiekuna=" + wiekOpiekuna +
                ", zwierze=" + zwierzeta +
                '}';
    }
}
